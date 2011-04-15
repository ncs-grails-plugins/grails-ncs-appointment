package edu.umn.ncs

class AppointmentLocation {
	String name
	StreetAddress address
	PhoneNumber phone
	
	static hasMany = [ appointmentTypes : AppointmentType ]
	
	String toString() { name }

    static constraints = {
    }
}
