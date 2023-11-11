FROM amazoncorretto:19
WORKDIR /app/render-be/jar
COPY ./target/render-be-*.jar application.jar

RUN ["chmod", "+rwx", "application.jar"]
