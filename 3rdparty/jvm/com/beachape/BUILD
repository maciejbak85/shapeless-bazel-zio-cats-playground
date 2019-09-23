load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "enumeratum",
    exports = [
        ":enumeratum_macros"
    ],
    jars = [
        "//external:jar/com/beachape/enumeratum_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "enumeratum_circe",
    exports = [
        ":enumeratum_macros"
    ],
    jars = [
        "//external:jar/com/beachape/enumeratum_circe_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/circe:circe_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":enumeratum"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "enumeratum_macros",
    jars = [
        "//external:jar/com/beachape/enumeratum_macros_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "enumeratum_reactivemongo_bson",
    exports = [
        ":enumeratum_macros"
    ],
    jars = [
        "//external:jar/com/beachape/enumeratum_reactivemongo_bson_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/reactivemongo:reactivemongo",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":enumeratum"
    ],
    visibility = [
        "//visibility:public"
    ]
)


