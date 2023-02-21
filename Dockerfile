FROM maven:3.9.0-eclipse-temurin-17-alpine

WORKDIR /app

COPY src src

COPY pom.xml .

CMD mvn clean package -DskipTests && java -jar target/Users-0.0.1-SNAPSHOT.jar

