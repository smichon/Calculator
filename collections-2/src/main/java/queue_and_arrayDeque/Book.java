package queue_and_arrayDeque;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    @Override
    public boolean equals(Object o) {
        final Book b = (Book) o;
        return this.title.equals(b.title) && this.author.equals(b.author) && this.year == b.year;
    }

    @Override
    public int hashCode() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\", (" + year + ")\nAuthor: " + author;
    }
}
