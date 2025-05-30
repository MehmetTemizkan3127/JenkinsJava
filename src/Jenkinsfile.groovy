pipeline {
    agent any

    stages {
        stage('Compile and Run C01') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac sr\\/C01.java'
                    } else {
                        bat 'javac src\\C01.java'
                    }
                }
            }
        }

        stage('Compile and Run C02') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac src\\C02.java'
                    } else {
                        bat 'javac src\\C02.java'
                    }
                }
            }
        }

        stage('Compile and Run C03') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'javac src\\C03.java'
                    } else {
                        bat 'javac src\\C03.java'
                    }
                }
            }
        }
    }
}
