package angulardemo



import org.junit.*
import grails.test.mixin.*

@TestFor(ProgramController)
@Mock(Program)
class ProgramControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/program/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.programInstanceList.size() == 0
        assert model.programInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.programInstance != null
    }

    void testSave() {
        controller.save()

        assert model.programInstance != null
        assert view == '/program/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/program/show/1'
        assert controller.flash.message != null
        assert Program.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/program/list'

        populateValidParams(params)
        def program = new Program(params)

        assert program.save() != null

        params.id = program.id

        def model = controller.show()

        assert model.programInstance == program
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/program/list'

        populateValidParams(params)
        def program = new Program(params)

        assert program.save() != null

        params.id = program.id

        def model = controller.edit()

        assert model.programInstance == program
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/program/list'

        response.reset()

        populateValidParams(params)
        def program = new Program(params)

        assert program.save() != null

        // test invalid parameters in update
        params.id = program.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/program/edit"
        assert model.programInstance != null

        program.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/program/show/$program.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        program.clearErrors()

        populateValidParams(params)
        params.id = program.id
        params.version = -1
        controller.update()

        assert view == "/program/edit"
        assert model.programInstance != null
        assert model.programInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/program/list'

        response.reset()

        populateValidParams(params)
        def program = new Program(params)

        assert program.save() != null
        assert Program.count() == 1

        params.id = program.id

        controller.delete()

        assert Program.count() == 0
        assert Program.get(program.id) == null
        assert response.redirectedUrl == '/program/list'
    }
}
