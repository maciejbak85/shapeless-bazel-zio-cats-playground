load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "circe_bson",
    jars = [
        "//external:jar/io/circe/circe_bson_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/reactivemongo:reactivemongo_bson",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_core",
    jars = [
        "//external:jar/io/circe/circe_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        ":circe_numbers"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_generic",
    exports = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_kernel",
        "//3rdparty/jvm/org/typelevel:macro_compat"
    ],
    jars = [
        "//external:jar/io/circe/circe_generic_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_generic_extras",
    jars = [
        "//external:jar/io/circe/circe_generic_extras_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_generic"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_java8",
    jars = [
        "//external:jar/io/circe/circe_java8_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_jawn",
    jars = [
        "//external:jar/io/circe/circe_jawn_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:jawn_parser",
        ":circe_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "circe_numbers",
    jars = [
        "//external:jar/io/circe/circe_numbers_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "circe_numbers_testing",
    jars = [
        "//external:jar/io/circe/circe_numbers_testing_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalacheck:scalacheck"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "circe_optics",
    jars = [
        "//external:jar/io/circe/circe_optics_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/github/julien_truffaut:monocle_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_parser",
    jars = [
        "//external:jar/io/circe/circe_parser_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":circe_core",
        ":circe_jawn"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "circe_testing",
    jars = [
        "//external:jar/io/circe/circe_testing_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scalatest:scalatest",
        "//3rdparty/jvm/org/typelevel:cats_laws",
        "//3rdparty/jvm/org/typelevel:discipline",
        ":circe_core",
        ":circe_numbers_testing"
    ],
    visibility = [
        "//visibility:public"
    ]
)


