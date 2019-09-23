load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "blaze_core",
    jars = [
        "//external:jar/org/http4s/blaze_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/log4s:log4s",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "blaze_http",
    jars = [
        "//external:jar/org/http4s/blaze_http_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/twitter:hpack",
        "//3rdparty/jvm/org/eclipse/jetty/alpn:alpn_api",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":blaze_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "http4s_blaze_client",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_blaze_client_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_blaze_core",
        ":http4s_client"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_blaze_core",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_blaze_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":blaze_http",
        ":http4s_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_blaze_server",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_blaze_server_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_blaze_core",
        ":http4s_server"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_circe",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_circe_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/circe:circe_jawn",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core",
        ":http4s_jawn"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_client",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_client_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_core",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_io",
        "//3rdparty/jvm/org/log4s:log4s",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        ":parboiled"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_dsl",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_dsl_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_jawn",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_jawn_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core",
        ":jawn_fs2"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_prometheus_metrics",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_prometheus_metrics_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/prometheus:simpleclient",
        "//3rdparty/jvm/io/prometheus:simpleclient_common",
        "//3rdparty/jvm/io/prometheus:simpleclient_hotspot",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core",
        ":http4s_dsl"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "http4s_server",
    exports = [
        "//3rdparty/jvm/io/chrisdavenport:vault"
    ],
    jars = [
        "//external:jar/org/http4s/http4s_server_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":http4s_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "jawn_fs2",
    jars = [
        "//external:jar/org/http4s/jawn_fs2_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:jawn_parser"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "parboiled",
    jars = [
        "//external:jar/org/http4s/parboiled_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


