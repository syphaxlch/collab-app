FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copier le JAR généré
COPY target/collab-api-0.0.1-SNAPSHOT.jar app.jar

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]
