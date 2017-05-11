lazy val root = (project in file(".")).
  settings(
    name := "scalatest",
    version := "0.1.0",
    scalaVersion := "2.12.2"
  )

libraryDependencies += "org.json" % "json" % "20160810"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
