load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "metadata_extractor",
    exports = [
        "//external:jar/com/drewnoakes/metadata_extractor"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/adobe/xmp:xmpcore"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


