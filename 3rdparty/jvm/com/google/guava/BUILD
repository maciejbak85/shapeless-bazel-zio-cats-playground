load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "guava",
    exports = [
        "//external:jar/com/google/guava/guava"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/google/j2objc:j2objc_annotations",
        "//3rdparty/jvm/org/checkerframework:checker_compat_qual"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


