load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "App",
    srcs = glob(["src/main/scala/ptest/*.scala"]),
    resources = [],
    deps = [
        "ShapelessPG",
        "Model",
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/joda_time:joda_time"
        ],
    main_class = "ptest.Main",
    visibility = ["//visibility:public"]
)

scala_library(
    name = "Model",
    srcs = ["src/main/scala/model/Model.scala"]
)

scala_library(
    name = "ShapelessPG",
    srcs = ["src/main/scala/pg/ShapelessPG.scala"],
    deps = [
             "Model",
            "//3rdparty/jvm/com/chuusai:shapeless",
            "//3rdparty/jvm/joda_time:joda_time"
            ]
)