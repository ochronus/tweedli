package controllers

import play.api._
import play.api.mvc._
import securesocial.core.{UserId, Identity, UserServicePlugin}
import securesocial.core.SecureSocial
import models.User
import twitter4j._
import twitter4j.auth._
import twitter4j.conf.ConfigurationBuilder


object Application extends Controller with SecureSocial {


  def index = UserAwareAction  { implicit request =>
    if (request.user != None) {


      val w_twitter = new TwitterFactory().getInstance()

      w_twitter.setOAuthConsumer(
        Play.current.configuration.getString("twitter.OAuthConsumerKey").get,
        Play.current.configuration.getString("twitter.OAuthConsumerSecret").get
      )



      val access_token = new AccessToken(
        request.user.get.oAuth1Info.get.token,
        request.user.get.oAuth1Info.get.secret
      )

      w_twitter.setOAuthAccessToken(access_token)


      val cb = new ConfigurationBuilder()
      val consumer_key = Play.current.configuration.getString("twitter.OAuthConsumerKey").get
      val consumer_secret = Play.current.configuration.getString("twitter.OAuthConsumerSecret").get

      cb.setDebugEnabled(true)
        .setOAuthConsumerKey(consumer_key)
        .setOAuthConsumerSecret(consumer_secret)
        .setOAuthAccessToken(request.user.get.oAuth1Info.get.token)
        .setOAuthAccessTokenSecret(request.user.get.oAuth1Info.get.secret)
      val tf = new TwitterFactory(cb.build())
      val twitter = tf.getInstance()

      //twitter.updateStatus(new StatusUpdate("Get your external IP fast:        dig +short myip.opendns.com @resolver1.opendns.com     #devs"))

    }

    val userId = if (request.user != None) request.user.get.id.id.toString + " " + request.user.get.id.providerId else "Not logged in"
    Ok(views.html.index(userId))
  }


}