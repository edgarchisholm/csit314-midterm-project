pipeline {
    agent any
    tools { jdk 'JDK17' }
    stages {
        stage('Checkout') { steps { checkout scm } }
        stage('Build and test') { steps { sh './mvnw --batch-mode clean verify' } }
    }
    post {
        success { archiveArtifacts artifacts: 'target/*.jar', fingerprint: true }
        always { junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml' }
    }
}
