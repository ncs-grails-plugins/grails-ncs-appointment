class NcsAppointmentGrailsPlugin {
    // the plugin version
    def version = "0.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.5 > *"
    // the other plugins this plugin depends on
    def dependsOn = [ ncsTracking : "0.3 > *", ncsPeople : "0.1 > *" ]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
			"grails-app/conf/*",
			"lib/"
    ]

    def author = "Aaron J. Zirbes"
    def authorEmail = "ajz@umn.edu"
    def title = "Appointment SchedulingDomain Classes Domain Classes"
    def description = '''\\
Domain classes necessary for Appointment Scheduling
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/ncs-appointment"
}
