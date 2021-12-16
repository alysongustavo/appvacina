pipeline {
    agent any
    tools {
            maven 'maven'
            jdk 'java'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat-container', path: '', url: 'http://34.207.125.72:8080/')], contextPath: '/appvacina', war: '**/*.war'
            }
        }
    }
}