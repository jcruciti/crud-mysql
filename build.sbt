name := """play2-crud-activator"""

version := "0.7.4-SNAPSHOT"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaCore, javaJdbc, javaEbean,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "play2-crud" %% "play2-crud" % "0.7.4-SNAPSHOT",
  "play2-crud" %% "play2-crud" % "0.7.4-SNAPSHOT" classifier "assets"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

resolvers += "release repository" at  "http://hakandilek.github.com/maven-repo/releases/"

resolvers += "snapshot repository" at "http://hakandilek.github.com/maven-repo/snapshots/"


fork in run := true