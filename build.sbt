val shapelessV = "2.3.3"
val zioV = "1.0.0-RC12-1"

lazy val root =  project.
  in(file(".")).
  settings(
    name := "shapeless-bazel-zio-cats-playground",
    version := "0.1",
    scalaVersion := "2.13.1",
    resolvers ++= Seq(
      Resolver.sonatypeRepo("releases"),
      Resolver.sonatypeRepo("snapshots")
    ),
    libraryDependencies ++= Seq(
      "com.chuusai" %% "shapeless" % shapelessV,
      "dev.zio" %% "zio" % zioV,
      "dev.zio" %% "zio-streams" % zioV,
      "joda-time" % "joda-time" % "2.10.3"
  )
  )

