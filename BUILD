load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_binary(
    name = "App",
    srcs = glob(["src/main/scala/**/*.scala"]),
    resources = [],
    deps = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/joda_time:joda_time"
        ],
    main_class = "ptest.Main",
    visibility = ["//visibility:public"]
)