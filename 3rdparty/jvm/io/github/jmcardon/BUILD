load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "tsec_cipher_core",
    jars = [
        "//external:jar/io/github/jmcardon/tsec_cipher_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_io",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        ":tsec_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "tsec_cipher_jca",
    jars = [
        "//external:jar/io/github/jmcardon/tsec_cipher_jca_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_io",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core",
        ":tsec_cipher_core",
        ":tsec_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "tsec_common",
    jars = [
        "//external:jar/io/github/jmcardon/tsec_common_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_io",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


