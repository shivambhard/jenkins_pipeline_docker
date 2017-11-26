import hudson.model.*
import jenkins.model.Jenkins;
job = Jenkins.instance.createProject(FreeStyleProject, 'testjob1')