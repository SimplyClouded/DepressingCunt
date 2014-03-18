package depressingcunt

class Quote {

	static mapping = {
		table "Quotes"
	}
	
	String quote
	String author
	Date dateRecorded
	
    static constraints = {
		quote blank: false
    }
}
