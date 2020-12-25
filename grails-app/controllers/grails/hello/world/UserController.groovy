package grails.hello.world

class UserController {

    UserService userService;
    def saveUser() {
        userService.serviceMethod();
    }
}
