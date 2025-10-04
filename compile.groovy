def call() {
    stage('COMPILE') {
        steps {
            sh 'mvn clean compile'
        }
    }
}
