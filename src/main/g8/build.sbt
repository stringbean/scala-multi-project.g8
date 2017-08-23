organization := "$organization$"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalaVersion := "2.12.3"
crossScalaVersions := Seq("2.11.11", "2.12.3")

// dependencies common for all sub-projects
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

lazy val $name;format="lower-camel"$$subproject1;format="word-only,upper-camel"$ = project
  .in(file("$name;format="word-only,lower"$-$subproject1;format="word-only,lower"$"))

lazy val $name;format="lower-camel"$$subproject2;format="word-only,upper-camel"$ = project
  .in(file("$name;format="word-only,lower"$-$subproject2;format="word-only,lower"$"))

lazy val root = project
  .in(file("."))
  .aggregate(
    $name;format="lower-camel"$$subproject1;format="word-only,upper-camel"$,
    $name;format="lower-camel"$$subproject2;format="word-only,upper-camel"$
  )
  .settings(
    publish := {},
    publishLocal := {}
  )
  .enablePlugins(ScalaUnidocPlugin)
