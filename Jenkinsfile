pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'     // This name must match what you configured in Jenkins
        jdk 'JDK 11'            // Match this to your project's Java version
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-username/your-repo.git'  // Replace with your repo
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishTestNG testResultsPattern: 'target/surefire-reports/testng-results.xml'
        }
    }
}
