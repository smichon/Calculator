package set_and_hashset;

import java.util.HashSet;

/*Przy użyciu wewnętrznego edytora Kodilla napisz program, który będzie przechowywał w zbiorze HashSet zestaw kilku
 obiektów reprezentujących książki.
Każda książka powinna mieć tytuł, autora i rok wydania
nie zapomnij również o zdefiniowaniu metod hashCode() oraz equals() dla swoich książek.
Następnie, przy pomocy poznanej w poprzednim module pętli for-each wyświetl w oknie konsoli tytuły
wszystkich książek znajdujących się w zbiorze, które zostały wydane przed 2010 rokiem.*/

public class Application {
    public static void main (String[] args) {

        HashSet<Book> books = new HashSet<Book>();

        books.add(new Book("50 shades of Grey", "Jahn Kowalsky", 1995));
        books.add(new Book("Sherlock Holmes", "Arthur Conan Doyle", 2010));
        books.add(new Book("The Last Mohikan", "Richard Athenborough", 1987));
        books.add(new Book("The infinity", "Karl Marx", 2015));
        books.add(new Book("Better Call Soul", "William Steinbeck", 2003));
        books.add(new Book("A Journey Into the Earth", "Great Digger", 2012));
        books.add(new Book("Binary Death", "Aiko Kobayashi", 2010));
        books.add(new Book("Breaking Bad", "Heavy Sleeper", 1990));
        books.add(new Book("50000 miles undersea journey", "Julius Verne", 2005));
        books.add(new Book("the Titanfall", "Che Guevara", 2001));
        books.add(new Book("Coma", "Peter Rogucki", 2011));
        books.add(new Book("People and Ants", "George Sand", 1989));
        books.add(new Book("To understand the Woman", "Andy Moore", 1994));
        books.add(new Book("Neverending Story", "Limahl", 1971));
        books.add(new Book("Book of Jungle", "Ryduard Kippling", 1980));

        System.out.println("Books published before 2010: \n");

        for(Book book: books) {
            if(book.getPrintingYear() < 2010) {
                System.out.println(book.getTitle());
            }
        }
    }
}
