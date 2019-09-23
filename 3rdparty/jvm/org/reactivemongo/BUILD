load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "reactivemongo",
    jars = [
        "//external:jar/org/reactivemongo/reactivemongo_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/typesafe/akka:akka_actor",
        "//3rdparty/jvm/com/typesafe/play:play_iteratees",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/dnsjava:dnsjava",
        "//3rdparty/jvm/org/apache/logging/log4j:log4j_api",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":reactivemongo_bson_macros",
        ":reactivemongo_shaded"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "reactivemongo_bson",
    jars = [
        "//external:jar/org/reactivemongo/reactivemongo_bson_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "reactivemongo_bson_macros",
    jars = [
        "//external:jar/org/reactivemongo/reactivemongo_bson_macros_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":reactivemongo_bson"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "reactivemongo_shaded",
    exports = [
        "//external:jar/org/reactivemongo/reactivemongo_shaded"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


