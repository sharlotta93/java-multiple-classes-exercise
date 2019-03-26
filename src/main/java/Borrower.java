import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int currentBooks() {
        return books.size();
    }

    public void borrowBook(Library library) {
        Book newBook = library.lendBook();
        books.add(newBook);
    }
}
