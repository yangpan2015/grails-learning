package grails.hello.world

import cn.hutool.core.util.IdUtil
import grails.gorm.transactions.Transactional

@Transactional
class DeleteDataController {


    def save() {
        for (int i = 0; i < 100; i++) {
            new DeleteData(data: IdUtil.fastSimpleUUID()).save(flush: true)
        }
        render('ok')
    }

    def delete(int id) {
        def data = DeleteData.get(id)
        data.delete(flush: true)
        render('ok')
    }

    def deleteData(String d) {
        DeleteData.where {
            data == d
        }.deleteAll()
        render('ok')
    }
}
