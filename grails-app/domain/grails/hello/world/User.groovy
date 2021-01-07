package grails.hello.world

class User {

    String name
    Integer age
    Date lastVisit
    INFO info
    static constraints = {
        age nullable: false
        name blank: false, validator: { val, obj ->
            return (val =~ ~/^\w.*/).find()
        }
        // 这个nullable为true 不知道为什么不生效
        info nullable: true
    }

    enum INFO {
        A, B, C
    }
}

