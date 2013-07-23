package models

import play.api.Play.current
import play.api.db.DB
import anorm._
import anorm.SqlParser._
import java.util.{Date}

case class Tweet(id: Pk[Long], message: String, added: Date, userId: Long, orderId: Long = 0, tweeted: Boolean=false)

object Tweet {

  val mapper = {
      get[Pk[Long]]("id") ~
      get[String]("message") ~
      get[Date]("added") ~
      get[Long]("user_id") ~
      get[Long]("order_id") ~
      get[Boolean]("tweeted") map {
        case id~message~added~user_id~order_id~tweeted => Tweet(id, message, added, user_id, order_id, tweeted)
      }
    }

    def findById(id: Long):Option[Tweet] = {
      DB.withConnection { implicit connection =>
        SQL("select * from tweets where id = {id}").on('id -> id).as(Tweet.mapper.singleOpt)
      }
    }

    def all:Seq[Tweet] = {
      DB.withConnection { implicit connection =>
        SQL("select * from tweets").as(Tweet.mapper *)
      }
    }

    def unprocessed:Seq[Tweet] = {
      DB.withConnection { implicit connection =>
        SQL("select * from tweets where tweeted = FALSE order by order_id ASC").as(Tweet.mapper *)
      }
    }

    def tweet_sent(id: Pk[Long]) {
      DB.withConnection { implicit connection =>
        SQL("update tweets set tweeted = TRUE where id = {id}").on(
          'id -> id
        ).executeUpdate
      }
    }

    def create(user_id: Long, message: String) = {
      DB.withConnection { implicit connection =>
        val sql_command =  SQL("insert into tweets (user_id, message)  values ({user_id}, {message});").on(
          'user_id -> user_id,
          'message -> message
        )
        sql_command.executeInsert()
      }
    }

}