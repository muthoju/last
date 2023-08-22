package org.jenkinsci.plugins.mylibrary

def call(logPath) {
    pipeline {
        agent any
        options {
            ansiColor('xterm')
        }
        stages {
            stage('Build') {
                steps {
                    script {
                        echo "Log path: ${logPath}"
                        // Rest of your pipeline steps...
                    }
                }
            }
        }
    }
}
