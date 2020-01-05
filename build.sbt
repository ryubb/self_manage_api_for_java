
name := """self_manage_api"""
organization := "com.tuyano.play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  javaWs,
  "mysql" % "mysql-connector-java" % "8.0.18",
  "io.ebean" % "ebean" % "11.15",
  evolutions
)
