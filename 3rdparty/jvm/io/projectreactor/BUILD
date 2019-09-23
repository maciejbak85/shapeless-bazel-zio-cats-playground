load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "reactor_core",
    exports = [
        "//external:jar/io/projectreactor/reactor_core"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/reactivestreams:reactive_streams"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


