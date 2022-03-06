pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
              echo "Building"
               bat "java -version"
            }

          
        }
   stage('Deploy') {
            steps {
              
               echo "DEPLOYING......"
                bat "mvn -version"
            }

          
        }
    }
}
