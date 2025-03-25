def call(String tool) {
    def success = true
    switch(tool.toLowerCase()) {
        case 'sonarqube':
            echo "Running SonarQube scan..."
            sh "echo 'Simulated SonarQube scan completed'"
            break
        case 'owasp':
            echo "Running OWASP scan..."
            sh "echo 'Simulated OWASP scan completed'"
            break
        default:
            error "Unsupported security tool: ${tool}"
            success = false
    }
    return success
}
