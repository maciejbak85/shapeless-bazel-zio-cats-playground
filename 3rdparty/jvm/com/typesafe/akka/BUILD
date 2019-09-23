load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "akka_actor",
    jars = [
        "//external:jar/com/typesafe/akka/akka_actor_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/typesafe:config",
        "//3rdparty/jvm/org/scala_lang/modules:scala_java8_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_http",
    jars = [
        "//external:jar/com/typesafe/akka/akka_http_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_http_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_http_caching",
    jars = [
        "//external:jar/com/typesafe/akka/akka_http_caching_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/github/ben_manes/caffeine:caffeine",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_http",
        ":akka_http_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_http_core",
    jars = [
        "//external:jar/com/typesafe/akka/akka_http_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_parsing"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_http_testkit",
    jars = [
        "//external:jar/com/typesafe/akka/akka_http_testkit_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_http"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_parsing",
    jars = [
        "//external:jar/com/typesafe/akka/akka_parsing_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_protobuf",
    jars = [
        "//external:jar/com/typesafe/akka/akka_protobuf_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "akka_slf4j",
    jars = [
        "//external:jar/com/typesafe/akka/akka_slf4j_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        ":akka_actor"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_stream",
    jars = [
        "//external:jar/com/typesafe/akka/akka_stream_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/typesafe:ssl_config_core",
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_actor",
        ":akka_protobuf"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_stream_kafka",
    exports = [
        "//3rdparty/jvm/org/apache/kafka:kafka_clients"
    ],
    jars = [
        "//external:jar/com/typesafe/akka/akka_stream_kafka_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_stream"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_stream_testkit",
    jars = [
        "//external:jar/com/typesafe/akka/akka_stream_testkit_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_stream",
        ":akka_testkit"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "akka_testkit",
    jars = [
        "//external:jar/com/typesafe/akka/akka_testkit_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":akka_actor"
    ],
    visibility = [
        "//visibility:public"
    ]
)


