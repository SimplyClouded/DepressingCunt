package depressingcunt

class Quote {

	static mapping = {
		table "quotes"
	}
	
	Integer id
	String quote
	String author
	Date dateRecorded
	
    static constraints = {
		quote blank: false
    }
}
