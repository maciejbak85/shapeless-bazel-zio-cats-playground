Download https://github.com/johnynek/bazel-deps
cd bazel-deps
bazel run //:parse -- generate -r ~/workspace/shapeless-bazel-zio-cats-playground -d jvm-dependencies.yaml -s 3rdparty/workspace.bzl

cd shapeless-bazel-zio-cats-playground
bazel build //:App
bazel run //:App
