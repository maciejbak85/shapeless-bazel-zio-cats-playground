load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "App",
    srcs = glob(["src/main/scala/ptest/*.scala"]),
    resources = [],
    deps = [
        "//src/main/scala/pg:ShapelessPG",
        "//src/main/scala/model:Model",
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/joda_time:joda_time"
        ],
    main_class = "ptest.Main",
    visibility = ["//visibility:public"]
)