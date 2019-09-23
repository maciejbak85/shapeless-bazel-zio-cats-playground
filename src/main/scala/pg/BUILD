load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

scala_library(
     name = "ShapelessPG",
     srcs = ["ShapelessPG.scala"],
     deps = [
             "//src/main/scala/model:Model",
             "//3rdparty/jvm/com/chuusai:shapeless",
             "//3rdparty/jvm/joda_time:joda_time"
             ],
     visibility = ["//visibility:public"]
)