package grails.hello.world

class WjyAccount {
    //企业id
    Company company;
    //万金油账号
    String accountNum;

    //创建时间
    Date dateCreated
    //更新时间
    Date lastUpdated

    static constraints = {
    }
    static mapping = {
        version false
    }
}
