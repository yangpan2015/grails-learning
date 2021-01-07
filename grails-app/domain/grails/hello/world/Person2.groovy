package grails.hello.world

class Person2 {
    String name;
    Person2 parent;
    //这个supervisor的一个作用 就是生成的外键的名字supervisor
    static belongsTo = [supervisor: Person2]

    static constraints = {
        supervisor nullable: true
    }
}
