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
			GRADLE_HOME	C:\gradle-3.1
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