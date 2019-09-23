load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "parboiled",
    jars = [
        "//external:jar/org/parboiled/parboiled_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parboiled_core",
    exports = [
        "//external:jar/org/parboiled/parboiled_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parboiled_java",
    exports = [
        "//external:jar/org/parboiled/parboiled_java"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/ow2/asm:asm",
        "//3rdparty/jvm/org/ow2/asm:asm_analysis",
        "//3rdparty/jvm/org/ow2/asm:asm_tree",
        "//3rdparty/jvm/org/ow2/asm:asm_util",
        ":parboiled_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


