pipeline{
   agent{
      node{
	     label 'Build Node1'
	  }
   }
   
   stages{
   
      stage("Checkout"){
	      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BADDHEM/SolutionDesignService.git']]])
	  }
   
     stage('Gradle Build') {
    if (isUnix()) {
        sh './gradlew clean build'
    } else {
        bat 'gradlew.bat clean build'
    }
    }
   }


}