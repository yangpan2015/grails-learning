package grails.hello.world

class Author3 {

    String name
    static hasMany = [books: Book3]
    static constraints = {
    }
}
