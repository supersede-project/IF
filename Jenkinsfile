pipeline { 
    agent any
    tools { 
        maven 'Maven 3.6.0' 
	gradle "Gradle 4.10.2"
    }
    stages { 
/*        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
*/
/*        stage('Gradle Build') { 
            steps { 
               echo 'Bulding Supersede IF with Gradle'
	       sh '''
		   cd IF/API/eu.supersede.if.api
		   gradle build -x test
	       '''
            }
        }
*/
	stage ('Maven Build') {
            steps {
                sh '''
		    cd IF/API/eu.supersede.if.api
		    mvn -s/var/jenkins_home/settings.xml clean package -DskipTests
		''' 
            }
        }

	stage ('Descartes') {
            steps {
                sh '''
		    cd IF/API/eu.supersede.if.api
		    cp /var/jenkins_home/ifaccount.properties src/test/resources/
		    mvn -s/var/jenkins_home/settings.xml -f pom_descartes.xml clean package -DskipTests
		    DATE=`date '+%Y%m%d%H%M'`
		    DESCARTES_OUT=./target/pit-reports/$DATE
		    mvn -s/var/jenkins_home/settings.xml -f pom_descartes.xml org.pitest:pitest-maven:mutationCoverage -DmutationEngine=descartes
		''' 
            }
        }
    }
}
