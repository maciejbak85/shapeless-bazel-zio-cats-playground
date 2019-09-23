load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
java_library(
    name = "netty_buffer",
    exports = [
        "//external:jar/io/netty/netty_buffer"
    ],
    runtime_deps = [
        ":netty_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "netty_codec",
    exports = [
        "//external:jar/io/netty/netty_codec"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_common",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_codec_dns",
    exports = [
        "//external:jar/io/netty/netty_codec_dns"
    ],
    runtime_deps = [
        ":netty_codec"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_codec_http",
    exports = [
        "//external:jar/io/netty/netty_codec_http"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_codec",
        ":netty_common",
        ":netty_handler",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_codec_http2",
    exports = [
        "//external:jar/io/netty/netty_codec_http2"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_codec",
        ":netty_codec_http",
        ":netty_common",
        ":netty_handler",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_codec_socks",
    exports = [
        "//external:jar/io/netty/netty_codec_socks"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_codec",
        ":netty_common",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_common",
    exports = [
        "//external:jar/io/netty/netty_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "netty_handler",
    exports = [
        "//external:jar/io/netty/netty_handler"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_codec",
        ":netty_common",
        ":netty_transport"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "netty_handler_proxy",
    exports = [
        "//external:jar/io/netty/netty_handler_proxy"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_codec",
        ":netty_codec_http",
        ":netty_codec_socks",
        ":netty_common",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_resolver",
    exports = [
        "//external:jar/io/netty/netty_resolver"
    ],
    runtime_deps = [
        ":netty_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_resolver_dns",
    exports = [
        "//external:jar/io/netty/netty_resolver_dns"
    ],
    runtime_deps = [
        ":netty_codec_dns",
        ":netty_resolver",
        ":netty_transport"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "netty_transport",
    exports = [
        "//external:jar/io/netty/netty_transport"
    ],
    runtime_deps = [
        ":netty_buffer",
        ":netty_common",
        ":netty_resolver"
    ],
    visibility = [
        "//visibility:public"
    ]
)


