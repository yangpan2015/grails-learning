package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class UserController {

    def saveUser() {
        def user = new User(name: 'abcd2', age: 10, lastVisit: new Date())
        user.save(flush: true)
    }

    /**
     * 测试约束
     */
    def saveData() {
        def user = new User(name: 'abcd', lastVisit: new Date())
        user.save(flush: true)
    }
}
