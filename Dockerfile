FROM jenkins:2.60.3

LABEL maintainer="RakeshKumar <rakesh635@gmail.com>"

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY groovy/* /usr/share/jenkins/ref/init.groovy.d/
COPY hudson.plugins.gradle.Gradle.xml /var/jenkins_home/
