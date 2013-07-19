package models

import play.api.Play.current

import com.novus.salat._
import com.novus.salat.annotations._
import com.novus.salat.dao._
import com.mongodb.casbah.Imports._
import se.radley.plugin.salat._
import mongoContext._


case class Tweet(
                 id: ObjectId = new ObjectId,
                 message: String,
                 @Key("userIdKey")userId: String,
                 added: Long = System.currentTimeMillis / 1000,
                 scheduled: Long = System.currentTimeMillis / 1000,
                 tweeted: Boolean = false
                 )

object Tweet extends ModelCompanion[Tweet, ObjectId] {
  val dao = new SalatDAO[Tweet, ObjectId](collection = mongoCollection("tweets")) {}

  def findOneByUseId(userid: String): Option[Tweet] = dao.findOne(MongoDBObject("userId" -> userid))

  def create(message: String, userid: String) = dao.insert(new Tweet(new ObjectId, message, userid))

  def unprocessed(): SalatMongoCursor[Tweet] = dao.find(MongoDBObject("tweeted" -> false))
}