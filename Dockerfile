FROM eclipse-temurin:25-jre
WORKDIR /app
COPY build/libs/app.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]