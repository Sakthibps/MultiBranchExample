pipeline {
  agent any
  stages {
    stage('Initial') {
      steps {
        echo 'DOne'
        build(job: 'InitialJon', wait: true, quietPeriod: 1)
      }
    }

  }
}