package angulardemo

class DemoService {

    def save(DemoThing demoThing) {

        if(demoThing.id) {
            def thing = DemoThing.load(demoThing.id)
            thing.name = demoThing.name
            thing.description = demoThing.description
            thing.save(failOnError: true)
        } else {
            demoThing.save(failOnError: true)
        }
    }

}
