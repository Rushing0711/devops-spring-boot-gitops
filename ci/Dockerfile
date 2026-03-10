# 仅包含 JRE 运行环境
FROM eclipse-temurin:21-jre-alpine

# 添加非 root 用户
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /app

# 从 Jenkins 编译好的 target 目录复制 jar 包
# 注意：Jenkins 在执行 docker build 前会先执行 mvn package
COPY target/*.jar app.jar

# 暴露端口
EXPOSE 8080

# 启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]