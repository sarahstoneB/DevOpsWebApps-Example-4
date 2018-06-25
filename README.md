# DevOpsWebSite - Phase-1 Example

mvn clean package

mvn clean test

mvn clean verify

mvn clean install

mvn clean deploy (make sure nexus repo details configured in pom.xml & settings.xml files)

mvn tomcat7:deploy (Make sure tomcat server is online)

mvn checkstyle:checkstyle checkstyle:check

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnViolation=false

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnError=false

mvn clean install -Pjacoco


