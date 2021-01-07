package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class SaveFailController {

    /**
     * 保存成功
     * @return
     */
    def saveSuccess() {
        new SaveFail(dataNotNull: 'abcd').save()
        render('ok')
    }
    /**
     * 保存失败不提醒
     * @return
     */
    def saveFailed() {
        new SaveFail().save()
        render('ok')
    }

    /**
     * 保存失败并提醒
     * @return
     */
    def saveFailedMention() {
        new SaveFail().save(failOnError: true)
        render('ok')
    }
}
