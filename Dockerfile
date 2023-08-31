FROM eclipse-temurin:17
COPY target/Deployment.jar Deployment.jar
CMD [ "java","-jar","Deployment.jar" ]