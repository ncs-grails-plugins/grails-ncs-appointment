package edu.umn.ncs

class AppointmentType {
	
	String name

	String toString() { name }
	
	static hasMany = [ studies : Study ]
}
