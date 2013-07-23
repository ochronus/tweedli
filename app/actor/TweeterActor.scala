package actor

import akka.actor.Actor
import play.api.{Play, Logger}
import Play.current
import models._
import securesocial.core.UserId
import twitter4j.{StatusUpdate, TwitterFactory}
import twitter4j.auth.AccessToken
import twitter4j.conf.ConfigurationBuilder


class TweeterActor extends Actor {

  def getTwitterUser(user_id: Long): Option[User] = {
    User.findOneBySocialId(new UserId(user_id.toString, "twitter"))
  }

  def getTwitter(user: User): Option[twitter4j.Twitter] = {
    val w_twitter = new TwitterFactory().getInstance()
    w_twitter.setOAuthConsumer(
      Play.configuration.getString("twitter.OAuthConsumerKey").getOrElse(""),
      Play.configuration.getString("twitter.OAuthConsumerSecret").getOrElse("")
    )
    val access_token = new AccessToken(
      user.oAuth1Info.get.token,
      user.oAuth1Info.get.secret
    )

    w_twitter.setOAuthAccessToken(access_token)
    Some(w_twitter)
  }

  def receive = {
    case _ => {
      for (tweet <- Tweet.unprocessed) {
        getTwitterUser(tweet.userId) match {
          case Some(user) => {
            getTwitter(user) match {
              case Some(twitter) => {
                val status_update = new StatusUpdate(tweet.message)
                //twitter.updateStatus(status_update)
                //Tweet.tweet_sent(tweet.id)
                //Console.println(f"Tweeted: ${tweet.id} '${tweet.message}'")
              }
              case None => Console.println(f"Unable to instantiate twitter for user ${user.id}")
            }
          }
          case None => Console.println(f"Unable to get user for tweet ${tweet.id.toString}")
        }
      }
    }
  }
}