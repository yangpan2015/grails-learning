package grails.hello.world

class Flight1 {

    String name
    //起飞时间
    Date startTime
    //到达时间
    Date endTime

    Airport1 startAirport
    Airport1 endAirport

    static constraints = {
    }
}
