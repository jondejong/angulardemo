package angulardemo

import grails.converters.JSON

class DemoThingController {

    def demoService

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
//        params.max = Math.min(max ?: 10, 100)
        render DemoThing.list(params) as JSON
    }

    def get() {
        render DemoThing as JSON
    }

    def save() {
        def demoThing = demoService.save(new DemoThing(name: params.name, description: params.description))
        render demoThing as JSON
    }
}
