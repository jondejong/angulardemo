package angulardemo

class ContentController {

    def demoThingList() {
        [layout: 'ajax']
    }

    def demoThingDetail() {
        [layout: request.xhr ? 'ajax' : 'application']
    }
}
