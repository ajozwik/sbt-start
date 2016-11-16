val scala11 = "2.11.8"
val scala12 = "2.12.0"

scalaVersion := scala11

organization := "pl.jozwik.demo"

name := "single"

version := "1.0.0"


crossScalaVersions := Seq(scala11, scala12)

val `org.scalatest_scalatest` = "org.scalatest" %% "scalatest" % "3.0.1" % "test"

val `org.scalacheck_scalacheck` = "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

val `com.typesafe.scala-logging_scala-logging` = "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

val `ch.qos.logback_logback-classic` = "ch.qos.logback" % "logback-classic" % "1.1.7"

lazy val root = projectName("root", new File(".")).settings(
  libraryDependencies ++= Seq(
    `org.scalatest_scalatest`,
    `org.scalacheck_scalacheck`,
    `com.typesafe.scala-logging_scala-logging`,
    `ch.qos.logback_logback-classic`
  ),
  packAutoSettings,
  packMain := Map("single" -> "pl.jozwik.demo.Main")
)

def projectName(name: String, file: File): Project = Project(name, file).settings(
)
