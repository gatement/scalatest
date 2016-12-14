libraryDependencies ++= Seq(
    "org.apache.logging.log4j" % "log4j-core" % "2.7",
    "org.apache.logging.log4j" % "log4j-api" % "2.7",
    "net.dongliu" % "requests" % "4.6.6",
    "org.json" % "json" % "20160810"  
    )

lazy val root = (project in file(".")).
  settings(
    name := "scalatest",
    version := "1.0",
    scalaVersion := "2.12.1"
  )

assemblyJarName in assembly := "scalatest.jar"
