package grails.hello.world

class Face3 {

    static hasOne = [nose3: Nose3]
    //这个unique作用是什么呢
    static constraints = {
        nose3 unique: true
    }
}
