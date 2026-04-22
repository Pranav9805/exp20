pipeline {
    agent any

    tools {
        maven 'mymaven'
    }

    stages {

        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
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
