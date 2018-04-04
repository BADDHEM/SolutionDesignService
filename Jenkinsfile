pipeline{
   agent{
      node{
	     label 'Build Node1'
	  }
   }
   
   stages{
   
      stage('Checkout'){
	  
	  steps {
              checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/BADDHEM/SolutionDesignService.git']]])

            }
	  }
   
     stage('Gradle Build') {
	    steps{
		   bat 'gradlew.bat clean build'
		}
        
    }
   }


}