package grails.hello.world

class Book {
    String name
    static hasMany = [reviews: Review]
    static constraints = {
    }
}
