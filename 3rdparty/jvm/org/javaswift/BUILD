load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "joss",
    exports = [
        "//external:jar/org/javaswift/joss"
    ],
    runtime_deps = [
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/org/apache/httpcomponents:httpclient",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:jcl_over_slf4j",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)


