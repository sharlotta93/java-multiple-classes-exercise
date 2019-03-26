import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("Princess Bride", "JK", "fantasy");
    }

    @Test
    public void canBorrowBook() {
       library.addBook(book);
       borrower.borrowBook(library);
       assertEquals(1, borrower.currentBooks());
       assertEquals(0, library.bookCount());
    }
}
