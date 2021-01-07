package grails.hello.world

import grails.converters.JSON

class Query1Controller {

    def list() {
        render(Query1.list() as JSON)
    }

    /**
     * offset max
     * offset 和mysql里面是完全一样的。 offset从0开始
     * 比如说limit 0,1   offset=0 max=1 表示第一条
     *
     * @return
     */
    def pageList(Integer offset, Integer max) {
        render(Query1.list([offset: offset, max: max]) as JSON)
    }

    /**
     * sort oder
     * 从捷算通项目来看sort后面跟的是Domain里面的名字而不是数据库里面列的名字
     * 生成的sql语句多了1个lower
     * <pre>
     *         select
     *         this_.id as id1_28_0_,
     *         this_.date as date2_28_0_,
     *         this_.test_name as test_nam3_28_0_
     *     from
     *         query1 this_
     *     order by
     *         lower(this_.test_name) desc
     * </pre>
     *
     * @return
     */
    def orderList() {
        render(Query1.list([sort: 'testName', order: 'desc']) as JSON)
    }

    def getAll(){
        render(Query1.getAll(3,5) as JSON)
    }

}
