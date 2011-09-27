package edu.umn.ncs

class AppointmentIncentive {
	Incentive incentive
	
	static belongsTo = [ appointment: Appointment  ]

    static constraints = {
    	incentive()
    }
}
