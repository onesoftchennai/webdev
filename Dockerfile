FROM eclipse-temurin:17

COPY target/webdev-0.0.1-SNAPSHOT.jar webdev.jar

CMD ["java", "-jar", "webdev.jar"]