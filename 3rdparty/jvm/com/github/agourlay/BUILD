load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "cornichon_core",
    jars = [
        "//external:jar/com/github/agourlay/cornichon_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/github/ben_manes/caffeine:caffeine",
        "//3rdparty/jvm/com/iheart:ficus",
        "//3rdparty/jvm/com/lihaoyi:fansi",
        "//3rdparty/jvm/com/typesafe/akka:akka_http",
        "//3rdparty/jvm/com/typesafe/akka:akka_stream",
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/io/circe:circe_generic",
        "//3rdparty/jvm/io/circe:circe_parser",
        "//3rdparty/jvm/io/monix:monix_execution",
        "//3rdparty/jvm/io/monix:monix_reactive",
        "//3rdparty/jvm/org/gnieh:diffson_circe",
        "//3rdparty/jvm/org/http4s:http4s_blaze_client",
        "//3rdparty/jvm/org/http4s:http4s_circe",
        "//3rdparty/jvm/org/parboiled:parboiled",
        "//3rdparty/jvm/org/sangria_graphql:sangria",
        "//3rdparty/jvm/org/sangria_graphql:sangria_circe",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_macros"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "cornichon_scalatest",
    jars = [
        "//external:jar/com/github/agourlay/cornichon_scalatest_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalatest:scalatest",
        ":cornichon_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "cornichon_test_framework",
    jars = [
        "//external:jar/com/github/agourlay/cornichon_test_framework_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_sbt:test_interface",
        ":cornichon_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


