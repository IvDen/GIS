#FROM maven:3.9.5-amazoncorretto-21 AS build
#ARG SERVICE_PASSWORD=changeMe
#WORKDIR /app/config/src
#COPY ./ ./
#RUN ["mvn",  "clean", "install", "-DservicePassword=${SERVICE_PASSWORD}"]
#
#FROM amazoncorretto:19 AS run
#WORKDIR /app/config/jar
#COPY --from=build /app/config/src/target/config-*.jar .

FROM amazoncorretto:19
WORKDIR /app/configurator/jar
COPY ./target/configurator-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
