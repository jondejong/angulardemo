package angulardemo



import org.junit.*
import grails.test.mixin.*

@TestFor(DemoThingController)
@Mock(DemoThing)
class DemoThingControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/demoThing/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.demoThingInstanceList.size() == 0
        assert model.demoThingInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.demoThingInstance != null
    }

    void testSave() {
        controller.save()

        assert model.demoThingInstance != null
        assert view == '/demoThing/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/demoThing/show/1'
        assert controller.flash.message != null
        assert DemoThing.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/demoThing/list'

        populateValidParams(params)
        def demoThing = new DemoThing(params)

        assert demoThing.save() != null

        params.id = demoThing.id

        def model = controller.show()

        assert model.demoThingInstance == demoThing
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/demoThing/list'

        populateValidParams(params)
        def demoThing = new DemoThing(params)

        assert demoThing.save() != null

        params.id = demoThing.id

        def model = controller.edit()

        assert model.demoThingInstance == demoThing
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/demoThing/list'

        response.reset()

        populateValidParams(params)
        def demoThing = new DemoThing(params)

        assert demoThing.save() != null

        // test invalid parameters in update
        params.id = demoThing.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/demoThing/edit"
        assert model.demoThingInstance != null

        demoThing.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/demoThing/show/$demoThing.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        demoThing.clearErrors()

        populateValidParams(params)
        params.id = demoThing.id
        params.version = -1
        controller.update()

        assert view == "/demoThing/edit"
        assert model.demoThingInstance != null
        assert model.demoThingInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/demoThing/list'

        response.reset()

        populateValidParams(params)
        def demoThing = new DemoThing(params)

        assert demoThing.save() != null
        assert DemoThing.count() == 1

        params.id = demoThing.id

        controller.delete()

        assert DemoThing.count() == 0
        assert DemoThing.get(demoThing.id) == null
        assert response.redirectedUrl == '/demoThing/list'
    }
}
