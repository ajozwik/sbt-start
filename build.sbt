val `scala_2.13` = "2.13.0"

val `scala_2.12` = "2.12.8"

val `scala_2.11` = "2.11.12"

scalaVersion := `scala_2.13`

crossScalaVersions := Seq(`scala_2.13`, `scala_2.12`, `scala_2.11`)

organization := "pl.jozwik.demo"

name := "single"

scalacOptions ++= Seq(
  "-encoding", "utf8", // Option and arguments on same line
  "-Xfatal-warnings", // New lines for each options
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials",
  "-language:postfixOps"
)


val `org.scalatest_scalatest` = "org.scalatest" %% "scalatest" % "3.0.8" % "test"

val `org.scalacheck_scalacheck` = "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"

val `com.typesafe.scala-logging_scala-logging` = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

val `ch.qos.logback_logback-classic` = "ch.qos.logback" % "logback-classic" % "1.2.3"

lazy val root = projectName("root", new File(".")).settings(
  libraryDependencies ++= Seq(
    `org.scalatest_scalatest`,
    `org.scalacheck_scalacheck`,
    `com.typesafe.scala-logging_scala-logging`,
    `ch.qos.logback_logback-classic`
  ),
  packMain := Map("single" -> "pl.jozwik.demo.Main")
)
  .enablePlugins(PackPlugin)

def projectName(name: String, file: File): Project = Project(name, file).settings(
)
