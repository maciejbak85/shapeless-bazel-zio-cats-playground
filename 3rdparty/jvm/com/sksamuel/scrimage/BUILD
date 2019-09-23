load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")
scala_import(
    name = "scrimage_core",
    jars = [
        "//external:jar/com/sksamuel/scrimage/scrimage_core_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/ar/com/hjg:pngj",
        "//3rdparty/jvm/com/drewnoakes:metadata_extractor",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_image",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_io",
        "//3rdparty/jvm/com/twelvemonkeys/common:common_lang",
        "//3rdparty/jvm/com/twelvemonkeys/imageio:imageio_core",
        "//3rdparty/jvm/com/twelvemonkeys/imageio:imageio_jpeg",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)


