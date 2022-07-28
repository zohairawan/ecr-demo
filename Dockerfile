FROM openjdk:8
EXPOSE 9000
ADD target/ecr-app.jar ecr.jar
ENTRYPOINT ["java", "-jar", "/ecr.jar"]