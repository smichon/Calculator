package time_measurement;

public class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String toString() {
        return "Author: " + author + ", title: \"" + title + "\"";
    }

    @Override
    public boolean equals(Object o) {
        final Book b = (Book) o;
        return this.author.equals(b.author) && this.title.equals(b.title);
    }
    @Override
    public int hashCode() {
        return Integer.parseInt(author.substring(0, 4));
    }
}
