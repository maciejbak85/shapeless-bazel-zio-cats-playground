load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "akka_http_circe",
    jars = [
        "//external:jar/de/heikoseeberger/akka_http_circe_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/typesafe/akka:akka_http",
        "//3rdparty/jvm/com/typesafe/akka:akka_stream",
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/io/circe:circe_jawn",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)


