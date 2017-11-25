import hudson.model.JDK
import hudson.tools.InstallSourceProperty
import hudson.tools.ZipExtractionInstaller

def descriptor = new JDK.DescriptorImpl();


def List<JDK> installations = []

javaTools=[['name':'jdk8', 'id':'jdk-8u152-oth-JPR'],
      ['name':'jdk7', 'id':'jdk-7u80-oth-JPR']]

javaTools.each { javaTool ->

    println("Setting up tool: ${javaTool.name}")

    def installer = new JDKInstaller(v.value, true)
	def installerProps = new InstallSourceProperty([installer])
	def installation = new JDK(v.key, "", [installerProps])
	installations.push(installation)

}
descriptor.setInstallations(installations.toArray(new JDK[installations.size()]))
descriptor.save()