package grails.hello.world

import grails.gorm.transactions.Transactional

@Transactional
class BookController {

    def index() {}


    def testCascadeSave() {
        new Book(name: 'Daemon')
        //addTo 点击的时候跳转的是hasMany
                .addToReviews(new Review(quote: 'Daemon does for surfing the Web what Jaws did for swimming in the ocean.', author: 'Chicago Sun-Times'))
                .addToReviews(new Review(quote: 'Daemon is wet-yourself scary, tech-savvy, mind-blowing!', author: 'Paste Magazine'))
                .save()
        render("ok")
    }

    /**
     * 不是太明白
     * addToReviews
     * removeFromReviews
     */
    Book replaceReviews(Serializable idParam, List<Review> newReviews) {
        Book book = Book.where { id == idParam }.join('reviews').get()
        clearReviews(book)
        newReviews.each { book.addToReviews(it) }
        book.save()
    }

    void clearReviews(Book book) {
        List<Serializable> ids = []
        book.reviews.collect().each {
            book.removeFromReviews(it)
            ids << it.id
        }
        Review.executeUpdate("delete Review r where r.id in :ids", [ids: ids])
    }
}
