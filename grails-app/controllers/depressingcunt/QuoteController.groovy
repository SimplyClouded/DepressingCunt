package depressingcunt

class QuoteController {

    def index() { 	
		Random rand = new Random()
		int max = Quote.count()
		
		Quote quote = Quote.list()[rand.nextInt(max)]
		[quote: quote]
	}
	
	def about() {
		
	}
}
