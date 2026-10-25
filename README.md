# CSIT314 Midterm Project — working draft

Canvas assignment: https://montclair.instructure.com/courses/220425/assignments/2787381
Due: October 25, 2026, 11:59 p.m.

This is the Spring Boot Java project for the midterm. `./mvnw clean verify`
builds and tests the project; `./mvnw spring-boot:run` starts it. The endpoint
is `GET /api/status`.

The Jenkinsfile checks out the repository, builds a runnable JAR, records the
test results, and archives the fat JAR. The Dockerized Jenkins installation
uses its bundled JDK and needs access to Maven Central.

## Evidence still needed

- Connect this project to the requested GitHub repository.
- Run a build in Dockerized Jenkins and capture setup and successful build screenshots.
- Write a report that answers the original questions and cites actual build evidence.
- Submit the final report and any required files in Canvas.
