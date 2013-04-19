package angulardemo

import grails.converters.JSON
import org.codehaus.groovy.grails.commons.GrailsClass

class ProgramController {

    def grailsApplication

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {

        grailsApplication.controllerClasses.each {
            GrailsClass g ->
            println g.name
        }

    }

    def list() {
        render Program.findAll() as JSON
    }

    def create() {
        render new Program() as JSON
    }

    def save() {

    }

    def show() {
        render Program.load(params.id) as JSON
    }
}