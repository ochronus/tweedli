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

  def getTwitter(user: SocialUser): Option[twitter4j.Twitter] = {
    val w_twitter = new TwitterFactory().getInstance()
    w_twitter.setOAuthConsumer(
      Play.configuration.getString("twitter.OAuthConsumerKey").getOrElse(""),
      Play.configuration.getString("twitter.OAuthConsumerSecret").getOrElse("")
    )
    val access_token = new AccessToken(
      user.OAuth(0).Token,
      user.OAuth(0).Secret
    )

    Console.println( user.OAuth)


    w_twitter.setOAuthAccessToken(access_token)
    Some(w_twitter)
  }

  def receive = {
    case _ => {
      for (tweet <- Tweet.unprocessed) {
        SocialUser.findById(tweet.userId) match {
          case Some(user) => {
            getTwitter(user) match {
              case Some(twitter) => {
                val status_update = new StatusUpdate(tweet.message)
                //twitter.updateStatus(status_update)
                //Tweet.tweet_sent(tweet.id)
                Console.println(f"Tweeted: ${tweet.id} '${tweet.message}'")
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