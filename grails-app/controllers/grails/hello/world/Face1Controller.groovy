package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class Face1Controller {
    static responseFormats = ['json']
    def index() { }

    def testCascade1(){
        new Face1(nose1: new Nose1()).save()
    }

    //不可以
    def testCascade2(){
        new Nose1(face1: new Face1()).save()
    }



    /**
     * 不能级联删除
     */
    def testDelete(){
        def f=Face1.get(1)
        f.delete()
        render("ok")
    }
    /**
     * 不可以级联删除
     */
    def testCascadeDelete(){
        def nose1= Nose1.get(3)
        nose1.delete()
        render("ok")
    }
}
