load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "fs2_redis_core",
    jars = [
        "//external:jar/com/github/gvolpe/fs2_redis_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/lettuce:lettuce_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_effect"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "fs2_redis_effects",
    jars = [
        "//external:jar/com/github/gvolpe/fs2_redis_effects_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/lettuce:lettuce_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":fs2_redis_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "fs2_redis_log4cats",
    jars = [
        "//external:jar/com/github/gvolpe/fs2_redis_log4cats_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/chrisdavenport:log4cats_core",
        "//3rdparty/jvm/io/lettuce:lettuce_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":fs2_redis_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "fs2_redis_streams",
    jars = [
        "//external:jar/com/github/gvolpe/fs2_redis_streams_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/co/fs2:fs2_core",
        "//3rdparty/jvm/io/lettuce:lettuce_core",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/typelevel:cats_effect",
        ":fs2_redis_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


