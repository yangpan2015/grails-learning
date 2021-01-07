package grails.hello.world

class Airport2 {
    String name
    //这个地方idea有提示
    static hasMany = [flights: Flight2]
    static mappedBy = [flights: 'startAirport']
    static constraints = {
    }
}
