load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "scaffeine",
    jars = [
        "//external:jar/com/github/blemale/scaffeine_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/github/ben_manes/caffeine:caffeine",
        "//3rdparty/jvm/org/scala_lang/modules:scala_java8_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)


