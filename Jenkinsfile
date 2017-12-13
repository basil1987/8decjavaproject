pipeline {
    agent app01

    stages {
        stage('Git') { 
            steps { 
		sh 'mkdir workspace/tmp && cd workspace/tmp'
                sh 'git clone git@github.com:basil1987/8decjavaproject.git .'
            }
        }
        stage('Build'){
            steps {
                sh 'cd workspace/tmp'
                sh '/usr/local/apache-ant-1.10.1/bin war'' 
            }
        }
        stage('Deploy') {
            steps {
                sh 'cd workspace/tmp/dist/AntExample.war /usr/local/apache-tomcat-7.0.82/webapps'
            }
        }
    }
}

