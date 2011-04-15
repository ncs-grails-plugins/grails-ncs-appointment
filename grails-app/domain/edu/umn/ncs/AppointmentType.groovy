package edu.umn.ncs

class AppointmentType {
	
	String name
	
	static hasMany = [ studies : Study ]
}
