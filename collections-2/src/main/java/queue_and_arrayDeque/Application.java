package queue_and_arrayDeque;

import java.util.ArrayDeque;

/*napisz program, który:
tworzy stos i umieszcza w nim pięć obiektów typu Book (możesz użyć klasy Book z przykładu),
sprawdza rozmiar stosu,
następnie usuwa wszystkie książki
i ponownie sprawdza rozmiar stosu.
Program powinien wyświetlić również, która książka została usunięta ze stosu jako ostatnia.*/

public class Application {

    public static void main (String[] args) {

        Book book1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book book2 = new Book("50 shades of Grey", "Jahn Kowalsky", 1995);
        Book book3 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 2010);
        Book book4 = new Book("The Last Mohikan", "Richard Athenborough", 1987);
        Book book5 = new Book("The infinity", "Karl Marx", 2015);
        Book book6 = new Book("Better Call Soul", "William Steinbeck", 2003);
        Book book7 = new Book("A Journey Into the Earth", "Great Digger", 2012);

        ArrayDeque<Book> books = new ArrayDeque<Book>();

        System.out.println("LIFO queue is created, it's size is: " + books.size());
        books.push(book1);
        books.push(book2);
        books.push(book3);
        books.push(book4);
        books.push(book5);
        books.push(book6);
        books.push(book7);
        System.out.println("LIFO queue is filled with " + books.size() + " elements");

        Book last = books.peekLast();
        for(Book book: books) {
            books.pop();
        }
        System.out.println("After removing there is " + books.size() + " elements in queue");
        System.out.println("---------------\nLast book was: \n" + last);
    }
}
