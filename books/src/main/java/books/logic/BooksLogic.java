package books.logic;

import books.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksLogic {

    List<Book> books = new ArrayList<>();

    // Könyvet felvenni
    public void addBook(Book book) {
        books.add(book);
    }

    // Könyveket listázni
    public List<Book> findAllBooks() {
        // sql select
        return books;
    }
}
