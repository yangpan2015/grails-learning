package grails.hello.world

class Person3 {
    String name
    Person3 parent

    static belongsTo = [ supervisor: Person3 ]

    static mappedBy = [ supervisor: "none", parent: "none" ]

    static constraints = { supervisor nullable: true }
}
