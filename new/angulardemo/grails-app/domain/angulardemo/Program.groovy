package angulardemo

class Program {

    String name
    String description

    static hasMany = [campaigns : Campaign]

    static constraints = {
    }
}
