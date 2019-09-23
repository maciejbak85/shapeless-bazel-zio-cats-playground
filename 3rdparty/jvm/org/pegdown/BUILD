load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "pegdown",
    exports = [
        "//external:jar/org/pegdown/pegdown"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/parboiled:parboiled_java"
    ],
    visibility = [
        "//visibility:public"
    ]
)


