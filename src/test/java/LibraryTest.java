import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Princess Bride", "JK", "fantasy");
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canLendBook() {
        library.addBook(book);
        library.lendBook();
        assertEquals(0, library.bookCount());
    }
}
