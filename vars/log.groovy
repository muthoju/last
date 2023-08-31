def colorizeOutput(line) {
    if (line.startsWith("[INFO]")) {
        return "\u001B[32m${line}\u001B[0m" // Green color for [INFO]
    } else if (line.startsWith("[WARNING]")) {
        return "\u001B[31m${line}\u001B[0m" // Red color for [WARNING]
    } else if (line.startsWith("[debug]")) {
        return "\u001B[35m${line}\u001B[0m" // Magenta color for [debug]
    } else {
        return line // No color for other lines
    }
}

return this
