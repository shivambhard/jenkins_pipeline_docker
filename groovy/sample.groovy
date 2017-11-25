import jenkins.model.*
import hudson.model.FreeStyleProject;

jobName = "create-dsl-job";
dslProject = new hudson.model.FreeStyleProject(jenkins, jobName);
