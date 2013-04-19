class UrlMappings {

	static mappings = {

        "/partial/$className/$action/"(controller: "partial" ){
            constraints {
                // apply constraints here
            }
        }

		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
