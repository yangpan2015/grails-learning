package grails.hello.world

class User {

    String name
    Integer age
    Date lastVisit
    static constraints = {
        age nullable: false
        name blank: false, validator: { val, obj ->
            return (val =~ ~/^\w.*/).find()
        }
    }
}

