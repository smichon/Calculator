package arrayList_linkedList;

import java.util.LinkedList;

public class BookList {

    private LinkedList<Book> books = new LinkedList<Book>();

    public void createBookList() {

        books.add(new Book("50 shades of Grey", 1995));
        books.add(new Book("Sherlock Holmes", 2001));
        books.add(new Book("The Last Mohikan", 1987));
        books.add(new Book("The infinity", 2005));
        books.add(new Book("Better Call Soul", 2003));
        books.add(new Book("A Journey Into the Earth", 1974));
        books.add(new Book("Binary Death", 2010));
        books.add(new Book("Breaking Bad", 1990));
        books.add(new Book("50000 miles undersea journey", 2005));
        books.add(new Book("the Titanfall", 2001));
        books.add(new Book("Coma", 2001));
        books.add(new Book("People and Ants", 1989));
        books.add(new Book("To understand the Woman", 1994));
        books.add(new Book("Neverending Story", 1971));
        books.add(new Book("Book of Jungle", 1980));
    }

    public void bookYearLessThan2k() {

        for(Book book: books) {
            if(book.getYear() >= 2000) {
                System.out.println(book);
            }
        }
    }
}
