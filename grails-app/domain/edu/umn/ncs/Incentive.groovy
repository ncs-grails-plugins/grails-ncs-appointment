package edu.umn.ncs

class Incentive {

	BigDecimal amount
	Boolean accepted = true
	IncentiveType type
	
	Boolean paymentStarted
	Boolean checkGenerated
	Integer checkNumber
	String pva
	
	String comments
	
	static belongsTo = [ appointment : Appointment ]
	
    static constraints = {
    }
}
