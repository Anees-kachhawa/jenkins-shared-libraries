def call(String Project,String ImageTag, String dockerhubuser){
           withCredentials([usernamePassword(
            credentialsId: "dockerHubCred",
            passwordVariable:"dockerHubPass",
            usernameVariable:"dockerhubUser")])
            {
                sh "docker login -u $dockerhubUser -p $dockerHubPass"
                sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
  
}
