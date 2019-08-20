import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.1.9"
  lazy val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.5.23"

  lazy val snippet1Deps = Seq(
    akkaHttp,
    akkaStream
  )
}
