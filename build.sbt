name := "learning-kafka"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % "2.0.1",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)
