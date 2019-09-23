load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "bson",
    exports = [
        "//external:jar/org/mongodb/bson"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "mongodb_driver_async",
    exports = [
        "//external:jar/org/mongodb/mongodb_driver_async"
    ],
    runtime_deps = [
        ":bson",
        ":mongodb_driver_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "mongodb_driver_core",
    exports = [
        "//external:jar/org/mongodb/mongodb_driver_core"
    ],
    runtime_deps = [
        ":bson"
    ],
    visibility = [
        "//visibility:public"
    ]
)


