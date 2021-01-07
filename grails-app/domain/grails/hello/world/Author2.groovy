package grails.hello.world

class Author2 {

    static hasMany = [books:Book2]
    String name
    static constraints = {
    }
}
