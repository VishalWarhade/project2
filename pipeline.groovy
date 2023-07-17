pipeline {
    agent node-01
    stages {
        stage ('pull') {
            steps{
                git branch: 'main', url: 'https://github.com/VishalWarhade/project.git'
            }
        }
        
        stage ('deploy') {
            steps {
                sh 'scp /var/lib/jenkins/workspace/job2/index.html root@172.31.40.255:/usr/share/nginx/html/'
            }
        }
        stage ('restart nginx') {
            steps{
                sh 'sudo systemctl restart nginx'
            }
        }

    }
}
