package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    // Attributes
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publishYear) {
        bookList.add(new Book(title, author, publishYear));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }

        return booksByAuthor;
    }

    public List<Book> searchByYear(int startYear, int endYear) {
        List<Book> booksByYear = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getPublishYear() >= startYear && book.getPublishYear() <= endYear) {
                    booksByYear.add(book);
                }
            }
        }

        return booksByYear;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;

        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = book;
                    break;
                }
            }
        }

        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Book 1", "Author 1", 2020);
        bookCatalog.addBook("Book 1", "Author 2", 2022);
        bookCatalog.addBook("Book 2", "Author 2", 2021);
        bookCatalog.addBook("Book 3", "Author 3", 2023);
        bookCatalog.addBook("Book 4", "Author 4", 1994);

        System.out.println(bookCatalog.searchByAuthor("Author 4"));
        System.out.println(bookCatalog.searchByYear(2020, 2022));
        System.out.println(bookCatalog.searchByTitle("Book 1"));
    }
}
