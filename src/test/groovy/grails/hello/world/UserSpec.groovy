package grails.hello.world

import grails.gorm.transactions.Transactional
import grails.testing.gorm.DomainUnitTest
import org.grails.orm.hibernate.HibernateDatastore
import org.springframework.transaction.PlatformTransactionManager
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

/**
 * 这边确实有点问题，我吧数据库的密码改错它还能运行。
 */
class UserSpec extends Specification {

    @Shared
    @AutoCleanup
    HibernateDatastore hibernateDatastore
    @Shared
    PlatformTransactionManager transactionManager

    void setupSpec() {
        hibernateDatastore = new HibernateDatastore(User)
        transactionManager = hibernateDatastore.getTransactionManager()
    }

    def cleanup() {
    }

    @Transactional
    def setup() {

        println(User.get(1))
    }

    void "test something"() {
        expect: "1"
    }
}
