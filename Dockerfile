FROM openjdk:14-alpine
COPY ./staging/ci-cd-process-maven-0.0.1-SNAPSHOT.jar ./myapp.jar
CMD ["java","-jar","myapp.jar"]
EXPOSE 8080
