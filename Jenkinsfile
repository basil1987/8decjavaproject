pipeline {
    agent{
	label tomcat
    } 

    stages {
        stage('Build'){
            steps {
                sh '/usr/local/apache-ant-1.10.1/bin war' 
            }
        }
    }
}

