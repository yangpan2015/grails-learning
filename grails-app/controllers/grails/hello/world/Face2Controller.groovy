package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class Face2Controller {
    static responseFormats = ['json']

    def index() {}

    def testCascade1() {
        new Face2(nose2: new Nose2()).save()
    }

    //不可以
    def testCascade2() {
        new Nose2(face2: new Face2()).save()
    }

    //不使用flush:true 无法删除不知道为什么，可能是没有使用Transactional
    def testDelete() {
        def f = Face2.get(1)
        f.delete(flush: true)
        render("ok")
    }
}
