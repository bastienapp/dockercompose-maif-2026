FROM eclipse-temurin:21-jdk-jammy AS backend-build

WORKDIR /app

COPY mvnw mvnw
COPY .mvn .mvn
COPY pom.xml pom.xml
COPY src src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jdk-jammy AS run

EXPOSE 8080

# COPY --from=backend-build /app/target/live26-0.0.1-SNAPSHOT.jar live26.jar
COPY --from=backend-build /app/target/*.jar live26.jar

ENTRYPOINT [ "java", "-jar", "live26.jar" ]