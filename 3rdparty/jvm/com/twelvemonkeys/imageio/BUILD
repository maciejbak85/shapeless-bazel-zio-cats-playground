load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "imageio_core",
    exports = [
        "//external:jar/com/twelvemonkeys/imageio/imageio_core"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/twelvemonkeys/common:common_image",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_io",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_lang"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "imageio_jpeg",
    exports = [
        "//external:jar/com/twelvemonkeys/imageio/imageio_jpeg"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/twelvemonkeys/common:common_image",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_io",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_lang",
        ":imageio_core",
        ":imageio_metadata"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "imageio_metadata",
    exports = [
        "//external:jar/com/twelvemonkeys/imageio/imageio_metadata"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/twelvemonkeys/common:common_image",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_io",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_lang",
        ":imageio_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


