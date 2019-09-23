load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "simpleclient",
    exports = [
        "//external:jar/io/prometheus/simpleclient"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "simpleclient_common",
    exports = [
        "//external:jar/io/prometheus/simpleclient_common"
    ],
    runtime_deps = [
        ":simpleclient"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "simpleclient_hotspot",
    exports = [
        "//external:jar/io/prometheus/simpleclient_hotspot"
    ],
    runtime_deps = [
        ":simpleclient"
    ],
    visibility = [
        "//visibility:public"
    ]
)


