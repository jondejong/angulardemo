import angulardemo.DemoThing
import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->

        JSON.registerObjectMarshaller(DemoThing) {DemoThing d->
            [
                    id: d.id,
                    name: d.name,
                    description: d.description
            ]
        }

        new DemoThing(name: 'Car', description: 'A Car').save(failOnError: true)
        new DemoThing(name: 'Car 2.0', description: 'Second Version of the Car').save(failOnError: true)
        new DemoThing(name: 'Ball', description: 'A Ball').save(failOnError: true)
        new DemoThing(name: 'Round Ball', description: 'An even rounder ball').save(failOnError: true)
        new DemoThing(name: 'Car 3.0', description: 'The third take on the car').save(failOnError: true)
        new DemoThing(name: 'Flat Ball', description: "This one's been deflated").save(failOnError: true)
        new DemoThing(name: 'Bouncy Ball', description: 'This one is fun.').save(failOnError: true)
        new DemoThing(name: 'Hoopy Ball', description: "He's got his own iPhone game.").save(failOnError: true)
        new DemoThing(name: 'Worthless Car', description: 'It has flat tires').save(failOnError: true)
        new DemoThing(name: 'Fork', description: 'Plain old fork').save(failOnError: true)
        new DemoThing(name: 'Unstoppable Car', description: 'Why did we cut the brake lines?').save(failOnError: true)
        new DemoThing(name: 'Plastic fork', description: "pretty sefl-explanitory, but it's a fork, made of plastic.").save(failOnError: true)
        new DemoThing(name: 'Purple fork', description: 'Yeah, why not?').save(failOnError: true)
    }
    def destroy = {
    }
}
