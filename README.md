# CSIT314 Midterm Project

Canvas assignment: https://montclair.instructure.com/courses/220425/assignments/2787381
Due: October 25, 2026, 11:59 p.m.

This is the Spring Boot Java project for the midterm. `./mvnw clean verify`
builds and tests the project; `./mvnw spring-boot:run` starts it. The endpoint
is `GET /api/status`.

The Jenkinsfile checks out the repository, builds a runnable JAR, records the
test result in the build log, verifies the JAR contains `BOOT-INF/lib/`, and
archives the fat JAR. The Dockerized Jenkins installation uses its bundled JDK
and needs access to Maven Central.

## Verified build

- Public repository: https://github.com/edgarchisholm/csit314-midterm-project
- Dockerized Jenkins job: `csit314-midterm-project` on local port 8083
- Successful build: #2, commit `5cf840a`, October 25, 2026
- Output: `csit314-midterm-project-0.1.0.jar` (18.89 MiB)
- Tests: 1 passed, 0 failed

The PDF report and supporting screenshots are stored locally in `evidence/`.
Submit the PDF report to Canvas as a file upload.
