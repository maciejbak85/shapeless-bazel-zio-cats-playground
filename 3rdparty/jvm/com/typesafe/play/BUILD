load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "play_iteratees",
    jars = [
        "//external:jar/com/typesafe/play/play_iteratees_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_stm:scala_stm"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


