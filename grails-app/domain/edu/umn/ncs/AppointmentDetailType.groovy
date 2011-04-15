package edu.umn.ncs

class AppointmentDetailType {
	String name
	Boolean useText = false
	String textLabel
	Boolean useCode = false
	String codeLabel
	Boolean useComments
	
	static hasMany = [ codes : AppointmentDetailCode
		, appointmentTypes: AppointmentType ]

    static constraints = {
    }
}
