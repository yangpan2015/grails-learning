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
        def u = new User(name: 'dddaaaa', age: 101, lastVisit: new Date())
        u.save()
        render view: 'third', model: [user: u]
    }

    /**
     * 测试enum
     *
     * @return
     */
    def fourth() {
        def u = new User(name: 'dddaaaa', age: 101, info: User.INFO.B, lastVisit: new Date())
        u.save()
        render view: 'third', model: [user: u]
    }

    /**
     * 测试 find max，这个接口有问题
     *
     * @return
     */
    def testFindMax() {
        return User.executeQuery('from user limit 1') as JSON
    }
}
