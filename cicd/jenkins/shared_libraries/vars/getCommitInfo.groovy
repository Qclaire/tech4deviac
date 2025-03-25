def call() {
    def commitHash = sh(script: 'git rev-parse HEAD', returnStdout: true).trim()
    def commitAuthor = sh(script: 'git log -1 --pretty=format:%an', returnStdout: true).trim()
    def commitMessage = sh(script: 'git log -1 --pretty=format:%s', returnStdout: true).trim()
    return [hash: commitHash, author: commitAuthor, message: commitMessage]
}
