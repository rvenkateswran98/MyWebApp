from eclipse-temurin:17
copy target/mywebapps.jar MyWebApps.jar
cmd ["java","-jar","MyWebApps.jar"]