FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/notificationService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

CMD ["java", "-jar", "notificationService-0.0.1-SNAPSHOT.jar"]