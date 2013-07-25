package models

import play.api.Play.current
import play.api.db.DB
import anorm._
import anorm.SqlParser._
import java.util.{Date}
import securesocial.core.{Identity, AuthenticationMethod, UserId}

case class SocialUser(id: UserId, added: Date,
                      firstName: String, lastName: String, fullName: String, email: Option[String],
                      avatarUrl: Option[String], OAuthId: Long
                       ) extends Identity {

  lazy val OAuth: Seq[models.OAuth] = DB.withConnection{ implicit connection =>
    SQL(
      """
        select oauth.*
        from social_users
        inner join oauth on oauth.id = social_users.oauth_id
        where social_users.id = {id}
      """
    ).on(
      'id -> this.id.id.toLong
    ).as(models.OAuth.mapper *)
  }

  def authMethod: securesocial.core.AuthenticationMethod = ???
  def oAuth1Info: Option[securesocial.core.OAuth1Info] = ???
  def oAuth2Info: Option[securesocial.core.OAuth2Info] = ???
  def passwordInfo: Option[securesocial.core.PasswordInfo] = ???
}

object SocialUser {

  val mapper = {
      get[Pk[Long]]("id") ~
      get[Date]("added") ~
      get[String]("first_name") ~
      get[String]("last_name") ~
      get[String]("full_name") ~
      get[Option[String]]("email") ~
      get[Option[String]]("avatar_url") ~
      get[Long]("oauth_id") map {
      case id~added~first_name~last_name~full_name~email~avatar_url~oauth_id => SocialUser(new UserId(id.toString, "twitter"), added, first_name,
        last_name, full_name, email, avatar_url, oauth_id
      )
    }
  }

  def findById(id: Long): Option[SocialUser] = {
    DB.withConnection { implicit connection =>
      SQL("select * from social_users where id = {id}").on('id -> id).as(SocialUser.mapper.singleOpt)
    }
  }

  def findOneBySocialId(id: UserId): Option[SocialUser] = {
    findById(id.id.toLong)
  }

  def all:Seq[SocialUser] = {
    DB.withConnection { implicit connection =>
      SQL("select * from social_users").as(SocialUser.mapper *)
    }
  }

  def create(user: Identity): Option[SocialUser] = {
    findById(user.id.id.toLong) match {
      case Some(user) => {
         Some(user)
      }
      case None => {
        DB.withConnection { implicit connection =>
          var oauth_id: Long = 0
          if (user.authMethod.is(AuthenticationMethod.OAuth1)) {
            OAuth.create(OAuth.OAuthv1, user.oAuth1Info.get.token, user.oAuth1Info.get.secret) match {
              case Some(oauth) => {
                val sql_command =  SQL("insert into social_users (id, first_name, last_name, full_name, email, avatar_url, oauth_id)  " +
                  "values ({user_id}, {first_name}, {last_name}, {full_name}, {email}, {avatar_url}, {oauth_id});").on(
                  'user_id -> user.id.id.toLong,
                  'first_name -> user.firstName,
                  'last_name -> user.lastName,
                  'full_name -> user.fullName,
                  'email -> user.email,
                  'avatar_url -> user.avatarUrl,
                  'oauth_id -> oauth.id
                )
                sql_command.executeInsert()  match {
                  case Some(id) => findById(id)
                  case None => None
                }
              }
              case None => {
                Console.println("Could not create OAuth record")
                None
              }
            }
          }
          else {
            None
          }
        }
      }
    }

  }


}