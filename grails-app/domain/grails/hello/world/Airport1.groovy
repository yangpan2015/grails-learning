package grails.hello.world

class Airport1 {
    String name
    static hasMany = [flight1: Flight1]
    //如果不写mappedBy两个外键都会参考f
//    static mappedBy = [flight1:'startAirport']
    static constraints = {
    }
}
