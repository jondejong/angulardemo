package angulardemo

class DemoThing {

    String name
    String description
    Date dateOfThing

    static constraints = {
        name nullable: false
    }
}
