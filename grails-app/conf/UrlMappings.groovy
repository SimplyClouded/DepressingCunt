class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller: "Quote", action:"index")
		"/about"(controller: "Quote", action: "about")
		"500"(view:'/error')
	}
}
