pipeline{
	
	 agent any
	 
	  tools {
        maven 'MyMaven'
        jdk 'MyJava'
    }
    
    stages{
		
		stage('Build')
		{
			steps{
				bat 'mvn clean compile'
			}
		}
		
		stage('Run TestNg Tests')
		{
			steps{
				bat 'mvn test'
			}
		}
		
		stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportDir: 'test-output',
                    reportFiles: 'index.html',
                    reportName: 'TestNG HTML Report'
                ])
            }
        }
	}
}