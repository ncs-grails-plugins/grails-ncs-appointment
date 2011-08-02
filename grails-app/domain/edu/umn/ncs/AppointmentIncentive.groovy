package edu.umn.ncs

class AppointmentIncentive {

	static belongsTo = [ appointment: Appointment, incentive: Incentive ]

    static constraints = {
    }
}
