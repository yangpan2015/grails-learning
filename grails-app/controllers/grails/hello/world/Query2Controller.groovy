package grails.hello.world

import grails.converters.JSON

class Query2Controller {

/**
 * 即使里面有两个叫abc的也只返回1个，而且如果找不到 as JSON会报空指针
 * @return
 */
    def find1(String name) {
        render(Player.findByName(name) as JSON)
    }

    def find2(int age) {
        render(Player.findByAge(age) as JSON)
    }
    def find3() {
        render(Player.findByNameLike('%a%') as JSON)
    }

    def find4(){
        render(Player.findByNameLikeAndAge('%a%',15) as JSON)
    }

    /**
     * 返回1个
     */
    def find5(){
        render(Player.findByAgeIsNotNull() as JSON)
    }

    def find6() {
        render(Player.findAllByName('abc') as JSON)
    }


    def find7(){
        render(Computer.findAllByPlayer(Player.findByName('pbq')) as JSON)
    }
}
