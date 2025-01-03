FROM tomcat:9.0
WORKDIR /usr/local/tomcat/webapps/
ADD **/*.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD [ "catalina.sh","run" ]