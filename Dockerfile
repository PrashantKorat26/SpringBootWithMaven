FROM openjdk:17
LABEL maintainer="prashant.korat26@gmail.com"
COPY /target/SpringBootWithMaven-01-0.0.1.jar spingboot-maven.jar
ENTRYPOINT ["java","-jar","spingboot-maven.jar"]
EXPOSE 5500