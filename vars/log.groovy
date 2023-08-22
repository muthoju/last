package org.jenkinsci.plugins.mylibrary

def call() {
    pipeline {
        agent any
        options {
            ansiColor('xterm')
        }
        stages {
            stage('Build') {
                steps {
                    script {
                        echo '\033[34mHello\033[0m \033[33mcolorful\033[0m \033[35mworld!\033[0m'
                    }
                }
            }
        }
    }
}
