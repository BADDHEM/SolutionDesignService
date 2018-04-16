pipeline {
    agent any
	
	options {
      skipDefaultCheckout(true)
     }
    stages {
        stage('checkout') {
            steps {
                git 'https://github.com/BADDHEM/SolutionDesignService.git'
            }
        }
		
		stage('BUILD') {
            steps {
			
            bat './gradlew clean build fatJar'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}