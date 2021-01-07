package grails.hello.world

class Flight3 {
    String name
    //起飞时间
    Date startTime
    //到达时间
    Date endTime

    Airport3 departureAirport
    Airport3 destinationAirport
    static constraints = {
    }
}
