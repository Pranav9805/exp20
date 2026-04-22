FROM tomcat:9
COPY target/sample-app.war /usr/local/tomcat/webapps/
EXPOSE 8080