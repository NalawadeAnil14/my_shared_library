def call(String appName, String imageName, String replicas){
    def deployment = libraryResource("deployment.yml")

    deployment = deployment.replaceAll("APP_NAME", appName)
    deployment = deployment.replaceAll("IMAGE_NAME", imageName)
    deployment = deployment.replaceAll("REPLICAS", replicas) 

    writeFile(file: "deployment.yml", text: deployment)
} 