load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "async_http_client",
    exports = [
        "//external:jar/org/asynchttpclient/async_http_client"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/sun/activation:javax_activation",
        "//3rdparty/jvm/com/typesafe/netty:netty_reactive_streams",
        "//3rdparty/jvm/io/netty:netty_codec_http",
        "//3rdparty/jvm/io/netty:netty_codec_socks",
        "//3rdparty/jvm/io/netty:netty_handler",
        "//3rdparty/jvm/io/netty:netty_handler_proxy",
        "//3rdparty/jvm/io/netty:netty_resolver_dns",
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        ":async_http_client_netty_utils"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "async_http_client_netty_utils",
    exports = [
        "//external:jar/org/asynchttpclient/async_http_client_netty_utils"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/sun/activation:javax_activation",
        "//3rdparty/jvm/io/netty:netty_buffer",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


