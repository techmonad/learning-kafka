name := "learning-kafka"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % "2.8.0",
  "ch.qos.logback" % "logback-classic" % "1.2.9"
)
