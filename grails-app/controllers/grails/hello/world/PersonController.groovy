package grails.hello.world

import grails.converters.JSON
import grails.gorm.transactions.Transactional

@Transactional
class PersonController {
    static responseFormats = ['json']

    def save(Person p) {
        if (p) {
            log.debug("${p.name},${p.age},${p.lastVisit}")
        }
        def person = new Person(name: "Fred", age: 40, lastVisit: new Date())
        person.validate()

        person.save()
    }

    /**
     * 测试get
     * @param id
     * @return
     */
    def first(Integer id) {
        //经过测试，如果说这个id不存在，person是null
        def person = Person.get(id)
        if (person) {
            log.debug("${person.name}")
        } else {
            log.debug("person==null")
        }
        renderPerson(person)
    }
    /**
     * 测试修改
     */
    def second(int id, String updateName) {
        //没有校验入参
        def person = Person.get(id)
        person.name = updateName
        person.save()
        renderPerson(person)
    }
    /**
     * 测试删除
     * 删除的时候发现了1个问题，就是发生异常的时候没有回滚，如果想回滚怎么办。
     */
    def delete(Integer id) {
        def p = Person.get(id)
        p.delete()
        renderPerson(p)
    }

    private def renderPerson(Person person) {
        render([person: person] as JSON)
    }
}
