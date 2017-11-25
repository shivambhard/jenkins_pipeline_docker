FROM jenkins:2.60.1

LABEL maintainer="RakeshKumar <rakesh635@gmail.com>"

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false -Dpattern=job/sample.groovy"

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY groovy/* /usr/share/jenkins/ref/init.groovy.d/