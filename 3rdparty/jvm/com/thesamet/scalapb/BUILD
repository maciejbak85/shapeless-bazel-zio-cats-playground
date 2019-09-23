load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "lenses",
    jars = [
        "//external:jar/com/thesamet/scalapb/lenses_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalapb_runtime",
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/lihaoyi:fastparse",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":lenses"
    ],
    visibility = [
        "//visibility:public"
    ]
)


