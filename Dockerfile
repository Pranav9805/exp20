FROM tomcat:9
COPY target/sample-app-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/sample-app.war
EXPOSE 8080
