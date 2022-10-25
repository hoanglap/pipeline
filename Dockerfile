FROM openjdk:11
EXPOSE 8080
ADD target/pipeline-ci-cd.jar pipeline-ci-cd.jar
ENTRYPOINT["java","-jar","/pipeline-ci-cd.jar"]