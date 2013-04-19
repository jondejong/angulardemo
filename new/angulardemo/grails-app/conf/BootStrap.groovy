import angulardemo.Campaign
import angulardemo.Program
import grails.converters.JSON

class BootStrap {


    def init = { servletContext ->

        JSON.registerObjectMarshaller(DemoThing) { Program d ->
            [
                    id: d.id,
                    name: d.name,
                    description: d.description
            ]
        }
        JSON.registerObjectMarshaller(DemoThing) { Campaign c ->
            [
                id: c.id,
                name: c.name,
                description: c.description
            ]
        }
    }

    def destroy = {
    }
}
