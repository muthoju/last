// Shared Groovy script: colorizeOutput.groovy

def call(line) {
    if (line.startsWith("[INFO]")) {
        ansiColor('xterm') {
            echo "\u001B[32m${line}\u001B[0m" // Green color for [INFO]
        }
    } else if (line.startsWith("[WARNING]")) {
        ansiColor('xterm') {
            echo "\u001B[31m${line}\u001B[0m" // Red color for [WARNING]
        }
    } else if (line.startsWith("[debug]")) {
        ansiColor('xterm') {
            echo "\u001B[35m${line}\u001B[0m" // Magenta color for [debug]
        }
    } else {
        echo line // No color for other lines
    }
}
