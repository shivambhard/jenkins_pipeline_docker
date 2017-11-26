import hudson.model.*
import jenkins.model.Jenkins;
import hudson.tasks.Shell;
job = Jenkins.instance.createProject(FreeStyleProject, 'testjob1')
job.buildersList.add(new Shell('echo hello world'))

