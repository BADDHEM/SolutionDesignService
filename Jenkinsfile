pipeline {
   agent any
   stages{
   
   stage('Checkout') { 
     steps{
      git https://BADDHEM@github.com/BADDHEM/SolutionDesignService.git
       } 
      
   }
   stage('Build') {
      // Run the maven build
    steps{
	 bat 'gradlew.bat clean build'
	}
        
      
   }
   }
  
}