pipeline {
   agent any

   stages {
      stage('BUILD') {
	steps {
	  sh '/usr/local/apache-ant-1.10.1/bin/ant war'
	  sh 'cp dist/*.war /var/www/html'
	}
      }
   }
}
