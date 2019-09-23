load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "fs2_core",
    jars = [
        "//external:jar/co/fs2/fs2_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scodec:scodec_bits",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "fs2_io",
    jars = [
        "//external:jar/co/fs2/fs2_io_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":fs2_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


