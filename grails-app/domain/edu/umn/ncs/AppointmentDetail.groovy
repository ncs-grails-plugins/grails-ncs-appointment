package edu.umn.ncs

class AppointmentDetail {
	
	AppointmentDetailType type
	AppointmentDetailCode detailCode
	String detailText
	String comments

    static constraints = {
		type()
		detailCode(nullable:true)
		detailText(nullable:true)
		comments(nullable:true)
    }
}
