import depressingcunt.Quote

class BootStrap {

    def init = { servletContext ->
		if(!Quote.count()){
			new Quote(quote: "Test Quote One", author: "John Doe", dateRecorded: new Date()).save(failOnError: true)
			new Quote(quote: "Test Quote Two", author: "Mark The Beast", dateRecorded: new Date()).save(failOnError: true)
		}
    }
    def destroy = {
    }
}
