load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "mongo_scala_bson",
    jars = [
        "//external:jar/org/mongodb/scala/mongo_scala_bson_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/mongodb:mongodb_driver_async",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "mongo_scala_driver",
    jars = [
        "//external:jar/org/mongodb/scala/mongo_scala_driver_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/mongodb:mongodb_driver_async",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        ":mongo_scala_bson"
    ],
    visibility = [
        "//visibility:public"
    ]
)


