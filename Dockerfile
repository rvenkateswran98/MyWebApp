from eclipse-temurin:17
copy target/MyWebApp.jar MyWebApp.jar
cmd ["java","-jar","MyWebApp.jar"]