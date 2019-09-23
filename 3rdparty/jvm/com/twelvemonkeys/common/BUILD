load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "common_image",
    exports = [
        "//external:jar/com/twelvemonkeys/common/common_image"
    ],
    runtime_deps = [
        ":common_io",
        ":common_lang"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "common_io",
    exports = [
        "//external:jar/com/twelvemonkeys/common/common_io"
    ],
    runtime_deps = [
        ":common_lang"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "common_lang",
    exports = [
        "//external:jar/com/twelvemonkeys/common/common_lang"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


