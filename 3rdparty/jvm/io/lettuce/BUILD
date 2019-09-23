load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "lettuce_core",
    exports = [
        "//external:jar/io/lettuce/lettuce_core"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/netty:netty_common",
        "//3rdparty/jvm/io/netty:netty_handler",
        "//3rdparty/jvm/io/netty:netty_transport",
        "//3rdparty/jvm/io/projectreactor:reactor_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


