FROM eclipse-temurin:latest
COPY API/target/app.jar /app.jar

EXPOSE 7070
ENTRYPOINT ["java", "-jar", "/app.jar"]
