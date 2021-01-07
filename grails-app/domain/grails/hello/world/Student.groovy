package grails.hello.world

class Student {
    String name
    //注意这个belongsTo
    static belongsTo = Teacher
    static hasMany = [teachers: Teacher]
    static constraints = {
    }
}
