FROM amazoncorretto:19
WORKDIR /app/discovery/jar
COPY ./target/discovery-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
