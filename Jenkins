node {
   
    stage('Maven Clean Build') {
        // Run the maven build
        def mavenHome = tool name: "Maven-3.6.3",type: "maven"
        
        def mavenCMD = "${mavenHome}/bin/mvn "
        sh "${mavenCMD} clean install"
        
    }
    
    stage("Build Docker Image") {
        sh "docker build -t chandramani/spring-boot-crud ."
    }
    
    stage("Docker Push") {
        withCredentials([string(credentialsId: 'DOCKER_HUB_CREDENTIALS', variable: 'DOCKER_HUB_CREDENTIALS')]) {
          sh "docker login -u chandramani -p ${DOCKER_HUB_CREDENTIALS}"
       }
       sh "docker push chandramani/spring-boot-crud"
    }
    
}
