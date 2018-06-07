package arrayList_linkedList;

public class Book {

    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "\nTitle: '" + title + '\'' + "\nYear: " + year;
    }
}
