FROM amazoncorretto:19
WORKDIR /app/gateway/jar
COPY ./target/gateway-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
