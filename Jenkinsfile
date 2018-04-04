pipeline {
   agent any
   stage('Checkout') { 
     steps{
      git https://BADDHEM@github.com/BADDHEM/SolutionDesignService.git
       } 
      
   }
   stage('Build') {
      // Run the maven build
    steps{
	 bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
	}
        
      
   }
  
}