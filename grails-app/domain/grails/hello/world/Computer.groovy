package grails.hello.world

class Computer {

    String computerName
    Player player
    static belongsTo = [player: Player]
    static constraints = {
    }
    static mapping = {
        version false
    }
}
