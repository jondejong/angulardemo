package angulardemo

class DemoController {

    def grailsApplication

    def index() {
        [controllerNames: grailsApplication.controllerClasses*.name]
    }
}
