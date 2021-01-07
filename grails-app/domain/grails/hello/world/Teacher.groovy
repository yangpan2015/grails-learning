package grails.hello.world

class Teacher {

    String name
    static hasMany = [students: Student]
    static constraints = {
    }
}
