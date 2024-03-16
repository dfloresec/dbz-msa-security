FROM openjdk:17-jdk-alpine
ENV client_secret=secreto
ENV key=xxxxx
ENV token_expiration_time=600
ADD build/libs/dbz-msa-security-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "app.jar"]