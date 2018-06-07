package mod_1_3_use_of_interfaces;

/*W swojej aplikacji stwórz:
Interfejs Quest, który będzie zawierał metodę process().
Dwie klasy DeadIslandQuest i EliteKnightQuest, które implementują interfejs Quest - wykorzystaj polecenie System.out.println().
Stwórz klasę Knight, która w konstruktorze przyjmie różne zadania implementujące interfejs Quest,
oraz dowolną metodę, która wywoła metodę process() interfejsu Quest.
Główny program powinien wyświetlić informacje o zakończeniu zadania razem z jego nazwą.*/

public class Application {
    public static void main (String[] args) {

        Knight knightDI = new Knight(new DeadIslandQuest());
        Knight knightEK = new Knight(new EliteKnightQuest());

        knightDI.mission();
        knightEK.mission();
    }
}
