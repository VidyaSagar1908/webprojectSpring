pipeline { 
    agent ChefAWS_Node 
     tools {
        maven 'mvn.3.6.3'
          }
    stages { 
        stage('test') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
        stage('package stage') { 
            steps { 
               sh 'mvn clean package'
               echo 'this is packaging'
               echo "M2_HOME = ${M2_HOME}" 
            }
        }
    }
}
