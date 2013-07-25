package models

import play.api.Play.current
import play.api.db.DB
import anorm._
import anorm.SqlParser._
import java.util.{Date}
import securesocial.core.AuthenticationMethod

case class OAuth(id: Pk[Long], OAuthVersion: Int, Token: String, Secret: String = "",
                 tokenType: String = "",
                 expiresIn: Int = 0, refreshToken: String = "", added: Date
                       )   {

}

object OAuth {
  val OAuthv1 = 1
  val OAuthv2 = 2
  val mapper = {
    get[Pk[Long]]("id") ~
      get[Int]("oauth_version") ~
      get[String]("token") ~
      get[String]("secret") ~
      get[String]("token_type") ~
      get[Int]("expires_in") ~
      get[String]("refresh_token") ~
      get[Date]("added") map {
      case id~oauth_version~token~secret~token_type~expires_in~refresh_token~added => OAuth(id, oauth_version,
        token, secret, token_type, expires_in, refresh_token, added)
    }
  }

  def findById(id: Long):Option[OAuth] = {
    DB.withConnection { implicit connection =>
      SQL("select * from oauth where id = {id}").on('id -> id).as(OAuth.mapper.singleOpt)
    }
  }

  def all:Seq[OAuth] = {
    DB.withConnection { implicit connection =>
      SQL("select * from oauth").as(OAuth.mapper *)
    }
  }


  def create(oauth_version: Int, token: String, secret: String = "",
             token_type: String = "",
             expires_in: Int = 0, refresh_token: String = "") = {

    DB.withConnection { implicit connection =>
      val sql_command  =  SQL("insert into oauth (oauth_version, token, secret, token_type, expires_in, refresh_token) " +
        "values ({oauth_version}, {token}, {secret}, {token_type}, {expires_in}, {refresh_token})").on(
        'oauth_version -> oauth_version,
        'token -> token,
        'secret -> secret,
        'token_type -> token_type,
        'expires_in -> expires_in,
        'refresh_token -> refresh_token
      )
      sql_command.executeInsert() match {
        case Some(id) => findById(id)
        case None => None
      }
    }
  }

}