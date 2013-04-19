package angulardemo

class Campaign {

    String name
    String description

    static belongsTo = [program : Program]

    static constraints = {
    }
}
