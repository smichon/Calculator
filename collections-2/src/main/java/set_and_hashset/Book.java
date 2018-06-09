package set_and_hashset;

public class Book {
    private String title;
    private String author;
    private Integer printingYear;

    public Book(String title, String author, int printingYear) {
        this.title = title;
        this.author = author;
        this.printingYear = printingYear;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPrintingYear() {
        return this.printingYear;
    }

    @Override
    public boolean equals(Object o) {
        final Book b = (Book) o;
        return this.title.equals(b.title) && this.author.equals(b.author) && this.printingYear.equals(b.printingYear);
    }

    @Override
    public int hashCode() {
        return printingYear;
    }

    @Override
    public String toString() {
        return "------------------\nYear of publication: " + printingYear + "\nAuthor: " + author + "\nTitle: " + title;
    }
}
