class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(resource: "/index.html")
		"500"(view:'/error')
	}
}
