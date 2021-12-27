# bottomline work
1- "hello-world" is a spingboot app that will print "hello-world" +counter (for each web page refresh).
   For example (for 3 web page refresh):
   hello-world 1 /n
   hello-world 2 /n
   hello-world 3

2- In the Dockerfile directory there are 2 files:
   - Dockerfile
   - jar file which is the result of the springboot app, after doing "Maven Build"

3- In Deployment directory there is deployment.yaml file which was made for kubernetes. 
   Deploying it to Minikube should be done with the following command: 
   "kubectl apply -f deployment.yaml"
