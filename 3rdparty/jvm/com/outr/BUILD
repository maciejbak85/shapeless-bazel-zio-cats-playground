load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "lucene4s",
    jars = [
        "//external:jar/com/outr/lucene4s_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/apache/lucene:lucene_analyzers_common",
        "//3rdparty/jvm/org/apache/lucene:lucene_core",
        "//3rdparty/jvm/org/apache/lucene:lucene_facet",
        "//3rdparty/jvm/org/apache/lucene:lucene_highlighter",
        "//3rdparty/jvm/org/apache/lucene:lucene_queryparser",
        "//3rdparty/jvm/org/powerscala:powerscala_io",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/typelevel:squants"
    ],
    visibility = [
        "//visibility:public"
    ]
)


