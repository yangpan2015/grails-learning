package grails.hello.world

class Player {

    String name
    Integer age
    static constraints = {
        age nullable: true
    }
    static mapping = {
        version false
    }
}
