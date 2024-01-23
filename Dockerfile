FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/tone_consulting-0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]