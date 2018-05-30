FROM openjdk:8
ADD target/kt-spring-web-actuator.jar kt-spring-web-actuator.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kt-spring-web-actuator.jar"]

# For kt-spring-web-actuator.jar were from target folder
# which get from config final name in pom.xml