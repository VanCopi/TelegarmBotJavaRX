FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test.javarush_RX_community_bot
ENV BOT_TOKEN=8917055052:AAHyf7YKYXb56MFi-IyctQ8Hiwole_NUZ6I
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]