pipeline {
    agent any
    stages {
        stage ('pull') {
            steps{
                git branch: 'main', url: 'https://github.com/VishalWarhade/project.git'
            }
        }
        
        stage ('deploy') {
            steps {
                sh 'mv /home/centos/workspace/job1/index.html /usr/share/nginx/html/index.html'
            }
        }
        stage ('restart nginx') {
            steps{
                sh 'sudo systemctl restart nginx'
            }
        }

    }
}
