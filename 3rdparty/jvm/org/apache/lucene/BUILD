load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "lucene_analyzers_common",
    exports = [
        "//external:jar/org/apache/lucene/lucene_analyzers_common"
    ],
    runtime_deps = [
        ":lucene_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "lucene_core",
    exports = [
        "//external:jar/org/apache/lucene/lucene_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "lucene_facet",
    exports = [
        "//external:jar/org/apache/lucene/lucene_facet"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/carrotsearch:hppc",
        ":lucene_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "lucene_highlighter",
    exports = [
        "//external:jar/org/apache/lucene/lucene_highlighter"
    ],
    runtime_deps = [
        ":lucene_analyzers_common",
        ":lucene_core",
        ":lucene_join",
        ":lucene_memory",
        ":lucene_queries"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "lucene_join",
    exports = [
        "//external:jar/org/apache/lucene/lucene_join"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "lucene_memory",
    exports = [
        "//external:jar/org/apache/lucene/lucene_memory"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "lucene_queries",
    exports = [
        "//external:jar/org/apache/lucene/lucene_queries"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "lucene_queryparser",
    exports = [
        "//external:jar/org/apache/lucene/lucene_queryparser"
    ],
    runtime_deps = [
        ":lucene_core",
        ":lucene_queries",
        ":lucene_sandbox"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "lucene_sandbox",
    exports = [
        "//external:jar/org/apache/lucene/lucene_sandbox"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


