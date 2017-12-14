pipeline {
   agent any

   stages {
      stage('BUILD') {
	steps {
	  sh 'ant war'
	  sh 'cp dist/*.war /var/www/html'
	}
      }
   }
}
