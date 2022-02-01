package books.ui;

import books.logic.BooksLogic;
import books.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksUi {

    private BooksLogic booksLogic = new BooksLogic();

    public void printMenu() {
        System.out.println("Mit szeretnél csinálni?\n" +
                "1. Könyv felvétele\n" +
                "2. Könyvek listázása\n" +
                "3. Kilépés"
                );
    }

    public static void main(String[] args) {
        BooksUi booksUi = new BooksUi();

        String answer = null;
        while (!"3".equals(answer)) {
            booksUi.printMenu();
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if ("1".equals(answer)) {
                booksUi.addBook();
            }
            if ("2".equals(answer)) {
                booksUi.listBooks();
            }
            System.out.println("Azt választottad, hogy: " + answer);
        }
    }

    private void listBooks() {
        List<Book> books = booksLogic.findAllBooks();
        for (Book book: books) {
            System.out.println(book.getIsbn() + "   " + book.getTitle());
        }
    }

    private void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi az ISBN szám?");
        String isbn = scanner.nextLine();
        System.out.println("Mi a cím?");
        String title = scanner.nextLine();

        Book book = new Book(isbn, title);
        booksLogic.addBook(book);
    }
}
