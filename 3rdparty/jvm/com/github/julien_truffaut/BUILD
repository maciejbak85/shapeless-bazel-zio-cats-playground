load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "monocle_core",
    jars = [
        "//external:jar/com/github/julien_truffaut/monocle_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_free",
        ":newts_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "monocle_law",
    jars = [
        "//external:jar/com/github/julien_truffaut/monocle_law_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalacheck:scalacheck",
        "//3rdparty/jvm/org/typelevel:discipline",
        ":monocle_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "monocle_macro",
    jars = [
        "//external:jar/com/github/julien_truffaut/monocle_macro_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/typelevel:macro_compat",
        ":monocle_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "newts_core",
    jars = [
        "//external:jar/com/github/julien_truffaut/newts_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


