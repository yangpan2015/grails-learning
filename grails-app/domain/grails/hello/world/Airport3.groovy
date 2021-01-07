package grails.hello.world

class Airport3 {
    static hasMany = [outboundFlights: Flight3, inboundFlights: Flight3]
    static mappedBy = [outboundFlights: "departureAirport",
                       inboundFlights : "destinationAirport"]
    static constraints = {
    }
}
