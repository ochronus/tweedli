import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "SocialTiming"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "securesocial" %% "securesocial" % "2.1.0",
    "org.twitter4j" % "twitter4j-core" % "3.0.3",
    "postgresql" % "postgresql" % "9.1-901.jdbc4",
    "com.typesafe.slick" % "slick_2.10" % "2.0.0-M2",
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    resolvers += Resolver.url("sbt-plugin-snapshots", url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns),
    resolvers += Resolver.sonatypeRepo("snapshots")

  )

}
