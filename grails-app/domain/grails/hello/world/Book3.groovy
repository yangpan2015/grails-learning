package grails.hello.world

class Book3 {

    String title
    static belongsTo = [author3: Author3]
    static constraints = {
    }
}
