package edu.umn.ncs

class AppointmentResult {
	
	// Used for Result Groupings
	AppointmentResultCategory category
	// Name of the result
	String name
	// Do we have the option to bill if this is the result?
	Boolean allowBillable = false
	
	String toString() { name }
	
    static constraints = {
    }
}
