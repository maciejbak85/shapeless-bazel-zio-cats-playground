load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "epimetheus",
    jars = [
        "//external:jar/io/chrisdavenport/epimetheus_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/chuusai:shapeless",
        "//3rdparty/jvm/io/prometheus:simpleclient",
        "//3rdparty/jvm/io/prometheus:simpleclient_common",
        "//3rdparty/jvm/io/prometheus:simpleclient_hotspot",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "log4cats_core",
    jars = [
        "//external:jar/io/chrisdavenport/log4cats_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "log4cats_slf4j",
    jars = [
        "//external:jar/io/chrisdavenport/log4cats_slf4j_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":log4cats_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "unique",
    jars = [
        "//external:jar/io/chrisdavenport/unique_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "vault",
    jars = [
        "//external:jar/io/chrisdavenport/vault_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":unique"
    ],
    visibility = [
        "//visibility:public"
    ]
)


