package grails.hello.world

class PersonMultiName {

    String name
    static hasMany = [nicknames: String]
    static constraints = {

    }
    //可以对nicknames进行微调
    static mapping = {
        nicknames joinTable: [name  : 'bunch_o_nicknames',
                              key   : 'person_id',
                              column: 'nickname',
                              type  : "text"]
    }
}
