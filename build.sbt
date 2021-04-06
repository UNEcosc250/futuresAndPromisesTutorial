lazy val root = (project in file(".")).
  settings(
    name := "future promise actor",
    version := "2021.0",
    scalaVersion := "3.0.0-RC1"
  )

libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-actor" % "2.5.3",
  ("com.typesafe.play" %% "play-ahc-ws-standalone" % "2.1.3").withDottyCompat(scalaVersion.value),
  ("com.typesafe.play" %% "play-ws-standalone-json" % "2.1.3").withDottyCompat(scalaVersion.value),
  "org.scalactic" %% "scalactic" % "3.2.6",
  "org.scalatest" %% "scalatest" % "3.2.6" % "test"
)
