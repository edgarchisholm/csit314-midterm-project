pipeline {
    agent any
    options { skipDefaultCheckout() }
    stages {
        stage('Checkout') { steps { checkout scm } }
        stage('Build and test') { steps { sh './mvnw --batch-mode clean verify' } }
        stage('Verify fat JAR') { steps { sh 'jar tf target/csit314-midterm-project-0.1.0.jar | grep -q BOOT-INF/lib/' } }
        stage('Archive artifact') { steps { archiveArtifacts artifacts: 'target/*.jar', fingerprint: true } }
    }
}
