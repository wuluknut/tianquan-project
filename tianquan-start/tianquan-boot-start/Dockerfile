FROM eclipse-temurin:17-jre

ENV TZ=Asia/Shanghai DB_HOST=pgsql JAVA_OPTS="" ARGS=""

EXPOSE 7000

VOLUME /tmp
WORKDIR /data

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar $ARGS"]
