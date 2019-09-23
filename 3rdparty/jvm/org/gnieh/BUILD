load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "diffson_circe",
    jars = [
        "//external:jar/org/gnieh/diffson_circe_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/io/circe:circe_parser",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":diffson_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "diffson_core",
    jars = [
        "//external:jar/org/gnieh/diffson_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


