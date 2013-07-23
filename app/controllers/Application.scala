package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import securesocial.core.{UserId, Identity, UserServicePlugin, AuthenticationMethod}
import securesocial.core.SecureSocial
import models.{User, Tweet, OAuth, SocialUser}
import twitter4j._
import twitter4j.auth._
import twitter4j.conf.ConfigurationBuilder
import org.codehaus.jackson.annotate.JsonValue


object Application extends Controller with SecureSocial {


  def index = UserAwareAction  { implicit request =>
    request.user match {
      case Some(user) => {
        Ok(views.html.app())
      }
      case None => Ok(views.html.index("Unknown"))
    }
  }

  def tweets = UserAwareAction  { implicit request =>
    request.user match {

      case Some(user) => {
        request.body.asJson match {
          case Some(post_json) => {
            val tw_id = Tweet.create(request.user.get.id.id.toLong, (post_json \\ "tweet")(0).as[String])
            Ok("")
          }
          case None => BadRequest("give me data, honey")
        }
      }

      case None => Unauthorized("go away")
    }
  }

}