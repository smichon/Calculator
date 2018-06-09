package time_measurement;

import java.util.*;

/*
Część 1
Stwórz klasę reprezentującą książkę o nazwie Book. Klasa powinna mieć dwa pola: author oraz title.
Pamiętaj o implementacji metod hashCode() oraz equals(Object o).
Będziemy jej używali jako obiektów kolekcji LinkedList w tej części zadania, oraz jako obiektów kolekcji HashMap
w drugiej części zadania.
Stwórz program, który zmierzy czas operacji wyszukiwania i usunięcia obiektu na początku
(z użyciem metody remove(Object o)), wyszukiwania i usunięcia obiektu na końcu (z użyciem metody remove(Object o)),
wstawiania na początku oraz wstawiania na końcu listy LinkedList liczącej kilka milionów obiektów.

Część 2
Stwórz program, który zmierzy czas operacji wyszukiwania po kluczu, a także czas dodawania i usuwania obiektu z mapy
 HashMap liczącej kilka milionów obiektów
 */

public class SpeedTest {

    public static void main (String[] args) {

        Random generator = new Random();
        List<Book> bookList = new LinkedList<>();
        Map<String, String> bookMap = new HashMap<>();

        for(int i=0; i < 1100000; i++) {
            bookList.add(new Book(Integer.toString(generator.nextInt(20)), Integer.toString(generator.nextInt(50))));
            bookMap.put(Integer.toString(i), Integer.toString(generator.nextInt(20)));
        }

        System.out.println("Size of ListCollection is: " + bookList.size() + " objects");
        System.out.println("Size of MapCollection is: " + bookMap.size() + " objects");

        CollectionTime obj = new CollectionTime();
        obj.linkedListTime(bookList);
        obj.hashMapTime(bookMap);
    }
}
