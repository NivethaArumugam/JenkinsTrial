pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
              
               
                 bat "mvn clean package"
            }

          
        }
   stage('Deploy') {
            steps {
              
               echo "DEPLOYING......"
            }

          
        }
    }
}
