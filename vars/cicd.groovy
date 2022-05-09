def newGit(repo)
{
  git "${repo}"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '4ee2b6b0-7b5e-4747-886b-8adf6411800f', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
  
}

def newTest(jobname)
{
  echo "${jobname}"
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}











