package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class ContentController {

    def index() {}


    def saveData() {
        new BookContent(ISBN: '1343214314', author: 'abcd').save()
        new BookContent(ISBN: '134', author: '43434').save()
        new PodCast(audioStream: 'abc'.getBytes(), author: 'bcd').save()
        render('ok')
    }

    def getData(){
        def content=Content.list()
        content.each {
            log.debug("${it}")
        }
        def bookContent= BookContent.list()
        bookContent.each {
            log.debug("${it}")
        }
        render('ok')
    }

    def testSaveFailure(){

    }
}
