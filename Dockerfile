
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /home/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
#RUN mvn dependency:resolve-plugins dependency:resolve dependency:go-offline

COPY src ./src/
RUN mvn clean install -Dmaven.test.skip=true --batch-mode --errors --fail-at-end --show-version -DinstallAtEnd=true -DdeployAtEnd=true

FROM amazoncorretto:23.0.1-alpine
WORKDIR /app
COPY --from=build /home/app/target/payment-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]
