package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def serviceMethod() {
        def user = new User(name: 'abcd', age: 10, lastVisit: new Date())
        user.save(flush: true)
    }
}
