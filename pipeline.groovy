pipeline {
    agent any
    stages {
        stage ('pull') {
            steps{
                git 'https://github.com/VishalWarhade/project.git'
            }
        }
        
        stage ('deploy') {
            steps {
                echo "deploy success"
            }
        }

    }
}