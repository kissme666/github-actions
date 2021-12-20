# github actions 

## 1. 基本的术语
- runner: github 分配的用来执行 CI/CD 的构建服务器 (也可以自建 runner)
- workflow: CI/CD 的工作流
- job: 任务，比如构建，测试和部署。每个 workflow 由多个 job 组成
- step: 每个 job 由多个 step 组成
- actions： 具体的构建指令

总结：一个workflow 由多个job 构成，一个job 由多个 step 构成，一个step中的最小单位就是 action (具体的指令)