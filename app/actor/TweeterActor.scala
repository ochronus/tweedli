package actor

import akka.actor.Actor
import play.api.Logger
import models._
import securesocial.core.UserId


class TweeterActor extends Actor {

  def receive = {
    case _ => {
      val unprocessed = Tweet.unprocessed
      for (tweet <- unprocessed) {
        Console.println(tweet.message + " " + User.findOneBySocialId(new UserId(tweet.userId, "twitter")).get.avatarUrl)
      }
    }
  }
}