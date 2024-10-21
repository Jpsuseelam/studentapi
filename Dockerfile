# Step 1: Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-alpine

# Step 2: Set a working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY target/studentapi-0.0.1-SNAPSHOT.jar /app/studentapi-0.0.1-SNAPSHOT.jar

# Step 4: Expose the port your Spring Boot app listens on
EXPOSE 8081

# Step 5: Command to run the application
ENTRYPOINT ["java", "-jar", "studentapi-0.0.1-SNAPSHOT.jar"]
