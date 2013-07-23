import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "SocialTiming"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "se.radley" %% "play-plugins-salat" % "1.2",
    "securesocial" %% "securesocial" % "master-SNAPSHOT",
    "org.twitter4j" % "twitter4j-core" % "3.0.3",
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    resolvers += Resolver.url("sbt-plugin-snapshots", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))(Resolver.ivyStylePatterns),
    resolvers += Resolver.sonatypeRepo("snapshots"),
    routesImport += "se.radley.plugin.salat.Binders._",
    templatesImport += "org.bson.types.ObjectId"
  )

}
