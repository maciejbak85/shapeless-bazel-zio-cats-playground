load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "coursier",
    jars = [
        "//external:jar/io/get_coursier/coursier_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang/modules:scala_xml",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "coursier_cache",
    jars = [
        "//external:jar/io/get_coursier/coursier_cache_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":coursier"
    ],
    visibility = [
        "//visibility:public"
    ]
)


