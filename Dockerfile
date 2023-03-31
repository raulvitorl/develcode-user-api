FROM public.ecr.aws/z1v2w8y7/concash-maven-jdk-8:3.8.6-openjdk-18-slim AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install package -Dmaven.test.skip=true
FROM gcr.io/distroless/java
COPY --from=build /usr/src/app/target/develcode-user-api-0.0.1-SNAPSHOT.jar /usr/app/develcode-user-api-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENV TZ America/Sao_Paulo
ENTRYPOINT ["java","-jar","/usr/app/develcode-user-api-0.0.1-SNAPSHOT.jar"]
