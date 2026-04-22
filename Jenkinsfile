pipeline {
    agent any

    tools {
        maven 'mymaven'
    }

    stages {

        stage('Clone Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Pranav9805/exp20.git'
            }
        }

        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t sample-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker stop myapp || exit 0'
                bat 'docker rm myapp || exit 0'
                bat 'docker run -d -p 8087:8080 --name myapp sample-app'
            }
        }
    }
}
