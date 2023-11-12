FROM amazoncorretto:19
WORKDIR /app/configurator/jar
COPY ./target/configurator-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
