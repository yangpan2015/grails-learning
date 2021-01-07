package grails.hello.world

class Review {
    String author
    String quote
    static belongsTo = [book: Book]
    static constraints = {
    }
}
