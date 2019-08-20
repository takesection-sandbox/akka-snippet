import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.pigumer"
ThisBuild / organizationName := "pigumer"

lazy val root = (project in file("."))
  .settings(
    name := "akka snippet",
    libraryDependencies += scalaTest % Test
  )

lazy val uriSnippet = (project in file("./uri-snippet"))
  .settings(
    name := "uri snippet",
    libraryDependencies ++= snippet1Deps
  )
