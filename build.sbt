lazy val minimal = (project in file(".")).
  settings(
    scalaVersion := "2.12.4",
    libraryDependencies ++= Vector(
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
