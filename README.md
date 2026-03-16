# springCloud
梦学谷 入门demo

## Mac Maven (mvn) 环境变量配置

### 1. 下载 Maven

从 Apache Maven 官网下载：<https://maven.apache.org/download.cgi>

选择 **Binary tar.gz archive** 文件（如 `apache-maven-3.x.x-bin.tar.gz`）下载后解压到指定目录，例如：

```bash
tar -xzf apache-maven-3.x.x-bin.tar.gz -C /usr/local/
```

### 2. 配置环境变量

确定你使用的 shell 类型：
- **zsh**（macOS Catalina 及以上默认）：编辑 `~/.zshrc`
- **bash**：编辑 `~/.bash_profile`

在对应的配置文件中添加以下内容：

```bash
# Maven 环境变量
export MAVEN_HOME=/usr/local/apache-maven-3.x.x
export PATH=$MAVEN_HOME/bin:$PATH
```

> 请将 `apache-maven-3.x.x` 替换为你实际下载的版本号。

### 3. 使配置生效

```bash
# 如果使用 zsh
source ~/.zshrc

# 如果使用 bash
source ~/.bash_profile
```

### 4. 验证安装

```bash
mvn -version
```

输出示例：

```
Apache Maven 3.x.x
Maven home: /usr/local/apache-maven-3.x.x
Java version: 1.8.x, vendor: Oracle Corporation
```

### 5. 构建本项目

```bash
cd microservice-cloud-01
mvn clean install
```