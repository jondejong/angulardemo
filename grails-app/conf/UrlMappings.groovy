class UrlMappings {

	static mappings = {
        "/demothing/$id?" (controller:"demoThing", parseRequest:true){
            action = [GET: 'index', PUT: 'update', POST:'save']
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
