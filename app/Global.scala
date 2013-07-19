import scala.annotation.implicitNotFound
import scala.concurrent.duration.DurationInt
import akka.actor.Props.apply
import play.api.Application
import play.api.GlobalSettings
import play.api.Logger
import play.api.Play
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.concurrent.Akka
import akka.actor.Props
import actor.TweeterActor

object Global extends GlobalSettings {

  override def onStart(app: Application) {

    val tweeterActor = Akka.system(app).actorOf(Props(new TweeterActor()))
    Akka.system(app).scheduler.schedule(0 seconds, 1 minutes, tweeterActor, "TweeterDaemon")

  }



}