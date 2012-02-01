package edu.umn.ncs

class Appointment {
	
	/** When does the appointment start */
	Date startTime
	/** When does the appointment end */
	Date endTime
	/** Who is the appointment with? */
	Person person
	/** With what  is the appointment with? */
	DwellingUnit dwellingUnit
	/** What study/project is the appointment for */
	Study study
	/** What kind of appointment was this? */
	AppointmentType type
	/** What was the result of the appointment */
	AppointmentResult result
	/** Can the costs be billed to outside parties? */
	Boolean billable
	/** Where is the appointment? */
	AppointmentLocation location
	/** Is this part of a sequence? */
	Integer sequenceNumber
	/** Is this a follow-up appointment */
	Boolean followUpAppointment
	/** This is handy for re-schedules and follow-ups */
	Appointment parentAppointment
	/** Who scheduled this appointment */
	String scheduledBy
	/** Generate a Letter? */
	Boolean generateLetter = false
	/** If a letter needs to be generated, save it here. */
	TrackedItem letter
	
	// Provenance Information

	/** Date the record was created */
	Date dateCreated = new Date()
	String userCreated
	String appCreated = 'ncs-appointment'
	
	Date lastUpdated
	String userUpdated
	
	String toString() {
		"${type} appointment on ${startTime}"
	}
	
	static hasMany = [ incentives: AppointmentIncentive, details: AppointmentDetail ]
	
    static constraints = {
		startTime()
		endTime(nullable:true)
		person(nullable:true)
		dwellingUnit(nullable:true)
		study()
		type()
		result(nullable:true)
		billable()
		location(nullable:true)
		sequenceNumber(nullable:true)
		followUpAppointment()
		parentAppointment(nullable:true)
		scheduledBy(nullable:true)
		generateLetter()
		letter(nullable:true)
		dateCreated()
		userCreated()
		appCreated()
		lastUpdated(nullable:true)
		userUpdated(nullable:true)
    }
}
