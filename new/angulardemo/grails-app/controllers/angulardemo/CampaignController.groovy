package angulardemo

import grails.converters.JSON

class CampaignController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {

    }

    def list() {
             render Campaign.findAll() as JSON
    }

    def create() {
        render new Campaign() as JSON
    }

    def save() {

    }

    def show() {
        render Campaign.load(params.id) as JSON
    }
}
