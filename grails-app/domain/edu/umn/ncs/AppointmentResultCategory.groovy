package edu.umn.ncs

class AppointmentResultCategory {
	String name
	
	String toString() { name }

    static constraints = {
		name()
    }
}
