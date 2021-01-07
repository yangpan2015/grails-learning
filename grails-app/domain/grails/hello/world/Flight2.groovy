package grails.hello.world

class Flight2 {
    String name
    //起飞时间
    Date startTime
    //到达时间
    Date endTime

    Airport2 startAirport
    Airport2 endAirport
    static constraints = {
    }
}
