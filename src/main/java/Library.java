import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int bookCapacity;

    public Library(int bookCapacity) {
        this.books = new ArrayList<>();
        this.bookCapacity = bookCapacity;
    }

    public int bookCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (bookCapacity > bookCount()) {
            books.add(book);
        }
    }

    public Book lendBook() {
        return books.remove(0);
    }
}
