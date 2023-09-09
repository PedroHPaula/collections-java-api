package main.java.list.Search;

public class Book {
    // Attributes
    private String title;
    private String author;
    private int publishYear;
    
    public Book(String title, String author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public String toString() {
        return "Book{"+title+", "+author+", "+publishYear+"}";
    }
    
}
