FROM ubuntu:latest
LABEL authors="G00403720@atu.ie"

ENTRYPOINT ["top", "-b"]

FROM openjdk:17-jdk-slim
ENV PROFILE=docker

WORKDIR /app

COPY target/Week11-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD["java", "-jar", "Week11-0.0.1-SNAPSHOT.jar"]