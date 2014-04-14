class UrlMappings {

	static mappings = {

    "/music" (resources: "music")

    "/music/search" (controller: "search") {
      action = [GET: "index"]
    }

		"/"(resource: "/index.html")
		"500"(view:'/error')
	}

}
