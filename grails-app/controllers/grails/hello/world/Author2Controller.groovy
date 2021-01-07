package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class Author2Controller {

    def index() {}

    def add() {
        new Author2(name: 'abcd').addToBooks(new Book2(title: 'abcd')).addToBooks(new Book2(title: 'mnpq')).addToBooks(new Book2(title: 'rst')).save()
    }

    def get() {
        def a = Author2.get(1)
        for (book in a.books) {
            println book.title
        }
        render('ok')
    }
}
