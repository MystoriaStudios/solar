pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                // Fetch the gradle.properties file from Jenkins credentials
                withCredentials([file(credentialsId: 'Gradle Properties', variable: 'GRADLE_PROPERTIES_PATH')]) {
                    sh 'cp $GRADLE_PROPERTIES_PATH gradle.properties'
                }
            }
        }

        stage('Build & Publish') {
            steps {
                script {
                    sh 'chmod +x gradlew'

                    if (env.BRANCH_NAME == 'main') {
                        echo "Building master branch"
                        sh './gradlew clean build publishMavenJavaPublicationToMystoriaProdRepository --stacktrace'
                    } else {
                        echo "Building feature or other branch: ${env.BRANCH_NAME}"
                        sh './gradlew clean build publishMavenJavaPublicationToMystoriaDevRepository --stacktrace'
                    }
                }

                archiveArtifacts artifacts: '**/solar-*.jar', fingerprint: true, followSymlinks: false, onlyIfSuccessful: true
            }
        }

        stage('Cleanup') {
            steps {
                sh 'rm gradle.properties'
            }
        }
    }
}