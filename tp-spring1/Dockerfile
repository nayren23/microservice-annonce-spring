FROM openjdk:17

LABEL authors="Nayren"

WORKDIR /app

EXPOSE 8080

COPY ./target/tp-spring1-0.0.1-SNAPSHOT.jar /app/tp-spring1.jar

ENTRYPOINT ["java","-jar","tp-spring1.jar"]