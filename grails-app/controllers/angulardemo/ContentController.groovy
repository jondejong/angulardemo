package angulardemo

class ContentController {

    def index() {
        println "${params.domain}/${params.targetAction}"
        render( view: "/${params.domain}/${params.targetAction}", model: [layout: 'ajax'] )
    }

}
