pipeline {
    agent any
    tools {
            maven 'maven'
            jdk 'java'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                sh 'deploy adapters: [tomcat9(credentialsId: 'tomcat-container', path: '', url: 'http://34.207.125.72:8080/')], contextPath: '/appvacina', war: '**/*.war''
            }
        }
    }
}