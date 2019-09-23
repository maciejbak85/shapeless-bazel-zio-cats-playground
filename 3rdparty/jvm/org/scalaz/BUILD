load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "scalaz_zio",
    jars = [
        "//external:jar/org/scalaz/scalaz_zio_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalaz_zio_interop",
    jars = [
        "//external:jar/org/scalaz/scalaz_zio_interop_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalaz_zio"
    ],
    visibility = [
        "//visibility:public"
    ]
)


