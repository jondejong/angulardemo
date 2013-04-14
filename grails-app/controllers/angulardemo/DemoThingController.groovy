package angulardemo

import grails.converters.JSON

class DemoThingController {

    def demoService

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }


    def list(Integer max) {
         if(params.id) {
            redirect(action: 'get', id: params.id)
        }
        render DemoThing.list(params) as JSON
    }


    def get() {
        render DemoThing.get(params.id) as JSON
    }

    def create() {
        render new DemoThing() as JSON
    }

    def update() {

    }

    def save() {
        def demoThing = new DemoThing(name: params.name, description: params.description)
        if(params.id) {
            demoThing.id = params.id;
        }
        render demoService.save(demoThing) as JSON
    }
}
