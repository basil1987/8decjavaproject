pipeline {
   agent any

   stages {
      stage('BUILD') {
	sh 'ant war'
	sh 'cp dist/*.war /var/www/html'
      }
   }
}
