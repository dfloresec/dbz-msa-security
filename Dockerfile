FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY app/build/lib/* build/lib/

COPY app/build/libs/dbz-msa-security-0.0.1-SNAPSHOT.jar build/

WORKDIR /app/build
ENTRYPOINT java -jar app.jar