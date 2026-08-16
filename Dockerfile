FROM eclipse-temurin:17-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY src/main/resources/application.properties application.properties
ENTRYPOINT ["java","-Dspring.datasource.password=${BOT_DB_PASSWORD}","-Dbot.username=${BOT_NAME}","-Dbot.token=${BOT_TOKEN}","-Dspring.datasource.username=${BOT_DB_USERNAME}","-jar", "app.jar"]