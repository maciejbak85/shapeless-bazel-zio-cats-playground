load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "fs2_kafka",
    jars = [
        "//external:jar/com/ovoenergy/fs2_kafka_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_core",
        "//3rdparty/jvm/org/apache/kafka:kafka_clients",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)


