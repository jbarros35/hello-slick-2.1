name := "hello-slick"

version := "1.0"

scalaVersion := "2.11.6"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.175",
  "joda-time" % "joda-time" % "1.6.2",
  "org.joda" % "joda-convert" % "1.8",
  "com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
