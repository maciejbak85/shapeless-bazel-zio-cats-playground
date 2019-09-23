load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "scredis",
    jars = [
        "//external:jar/com/github/scredis/scredis_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/typesafe/akka:akka_actor",
        "//3rdparty/jvm/com/typesafe/scala_logging:scala_logging",
        "//3rdparty/jvm/com/typesafe:config",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)


