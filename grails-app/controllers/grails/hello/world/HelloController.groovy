package grails.hello.world

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import grails.helloword.data.UserData

@Transactional
class HelloController {

    static responseFormats = ['json']

    def index() {
        def user = new UserData(name: 'abcd', age: 32)
        render user as JSON
    }

    def second() {
        render([view: "/hello/hello"])
    }

    def third() {
        def u = new User(name: 'dddaaaa', age: 100, lastVisit: new Date())
        render view: 'third', model: [user: u]
    }
}
