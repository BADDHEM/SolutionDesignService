pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                git 'https://github.com/BADDHEM/SolutionDesignService.git'
            }
        }
		
		stage('BUILD') {
            steps {
                bat 'gradlew clean build'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}