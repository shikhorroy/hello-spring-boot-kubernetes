FROM openjdk:21-jdk-oracle
WORKDIR ./app
COPY ./target/spring-boot-app-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
