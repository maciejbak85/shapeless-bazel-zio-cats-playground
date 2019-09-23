load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "monix_eval",
    jars = [
        "//external:jar/io/monix/monix_eval_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":monix_execution"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "monix_execution",
    jars = [
        "//external:jar/io/monix/monix_execution_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_effect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "monix_reactive",
    jars = [
        "//external:jar/io/monix/monix_reactive_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/jctools:jctools_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":monix_eval",
        ":monix_execution"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


