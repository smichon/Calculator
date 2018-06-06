/*KROK 1 Stwórz klasę
Nazwij ją User.
Dodaj atrybuty użytkownika takie jak: imię, nazwisko, płeć, wiek, mail.
Utwórz konstruktor dla tej klasy.
Stwórz metody charakterystyczne dla klasy użytkownika tj.: logowanie, usunięcie konta.
Stwórz gettery dla atrybutów klasy.

KROK 2 Stwórz klasę podrzędną (dziedziczącą po klasie User).
Nazwij ją ForumUser.
Dodaj atrybuty charakterystyczne dla użytkownika forum np. nazwa użytkownika, liczba postów, zalogowany (true/false).
Utwórz konstruktor dla użytkownika forum.
Stwórz metody charakterystyczne dla użytkownika forum np. opublikowanie postu na forum czy komentowanie postu oraz taką która będzie przedstawiała użytkownika w konsoli.
Odziedzicz właściwości klasy User.
Rozbuduj konstruktor o metodę super().

KROK 3 Stwórz klasę Application:
Stwórz w niej metodę main().
Utwórz nowy obiekt ForumUser.
Wywołaj metodą która przedstawi nam użytkownika forum w konsoli.*/

public class Application {
    public static void main (String[] args)
    {
        ForumUser forumUser = new ForumUser("Forumowicz", 234, true, "Jan", "Kowalski", "male", 32, "jan@kowalski.com");

        forumUser.introduceUser();
    }
}
