# Use the official OpenJDK 11 base image built on Alpine for a smaller image
FROM adoptopenjdk/openjdk11:alpine-jre

# Specify the build artifact path (the JAR file that Maven generates)
ARG artifact=target/spring-boot-app-1.0-SNAPSHOT.jar  # Update the version accordingly

# Set the working directory inside the container
WORKDIR /opt/app

# Copy the artifact (JAR file) into the container and rename it as app.jar
COPY ${artifact} app.jar

# Set the entrypoint to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
