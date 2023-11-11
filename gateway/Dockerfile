FROM amazoncorretto:19
WORKDIR /app/render-be/jar
COPY ./target/gateway-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
