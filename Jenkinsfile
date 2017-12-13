pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh '/usr/local/apache-ant-1.10.1/bin/ant war' 
		sh 'cp dist/AntExample.war /var/www/html'
	    }
        }
    }
}

