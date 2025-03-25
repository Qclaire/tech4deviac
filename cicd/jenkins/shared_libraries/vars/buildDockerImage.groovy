def call(String imageName, Map buildArgs = [:]) {
    def argString = buildArgs.collect { key, value -> "--build-arg ${key}=${value}" }.join(' ')
    echo "Building Docker image: ${imageName} with args: ${argString}"
    sh "docker build ${argString} -t ${imageName} ."
}
