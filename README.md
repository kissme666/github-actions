# github actions

## 1. 基本的术语

- runner: github 分配的用来执行 CI/CD 的构建服务器 (也可以自建 runner)
- workflow: CI/CD 的工作流
- job: 任务，比如构建，测试和部署。每个 workflow 由多个 job 组成
- step: 每个 job 由多个 step 组成
- actions： 具体的构建指令

总结：一个workflow 由多个job 构成，一个job 由多个 step 构成，一个step中的最小单位就是 action (具体的指令)

## 2. 总结

1. gradle 的本地包不要忽略（gradle的插件要用本地jar包）
2. ./gradlew xxx ACCESS DENIED 的问题，是 gradlew 无执行权限, 赋予 +x 权限即可

参考文档：

```yaml
# This workflow will build a Java project with Maven, and cache/restore any dependencies to improve the workflow execution time
# For more information see: https://help.github.com/actions/language-and-framework-guides/building-and-testing-java-with-maven

# action name
name: Java CI with Maven

# 触发条件
on:
  push:
    branches:
      - devlop


# workflow
jobs:
  build:
    runs-on: ubuntu-latest # 依赖的镜像
    steps:
      - uses: actions/checkout@v2
      - uses: actions/setup-java@v2
        with:
          distribution: 'zulu'
          java-version: '11'
          cache: 'gradle'
      - name: fix gradlew access deniend
        run: sudo chmod +x ./gradlew
      - run: ./gradlew build --no-daemon

```

