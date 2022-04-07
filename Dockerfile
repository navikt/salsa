FROM openjdk:8-slim

COPY build/libs/com.example.onion-0.0.1-all.jar app.jar
CMD ["java","-jar","app.jar"]
