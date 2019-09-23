load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "scala_collection_compat",
    jars = [
        "//external:jar/org/scala_lang/modules/scala_collection_compat_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scala_java8_compat",
    jars = [
        "//external:jar/org/scala_lang/modules/scala_java8_compat_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_library(
    name = "scala_parser_combinators",
    exports = [
        "@io_bazel_rules_scala_scala_parser_combinators//:io_bazel_rules_scala_scala_parser_combinators"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_library(
    name = "scala_xml",
    exports = [
        "@io_bazel_rules_scala_scala_xml//:io_bazel_rules_scala_scala_xml"
    ],
    visibility = [
        "//visibility:public"
    ]
)


