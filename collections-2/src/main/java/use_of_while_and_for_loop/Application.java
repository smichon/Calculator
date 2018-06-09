package use_of_while_and_for_loop;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Część 1
Napisz program, który w kolejce ArrayDeque umieści 50 obiektów przechowujących napisy, składające się
z litery 'a' powtórzonej losową ilość razy (zakres powtórzeń: 1 - 50).
Wypełnienie obiektu powtórzeniami litery 'a' zrealizuj przy pomocy pętli for.
Część 2
Program z części pierwszej rozbuduj w taki sposób, że przekażesz utworzoną kolejkę do metody Twojej klasy,
która dokona rozdzielenia obiektów z kolejki na dwie kolekcje ArrayList.
Jedna z nich będzie przechowywała obiekty o parzystej ilości znaków 'a', a druga o nieparzystej.
*/

public class Application {

    public static void main (String[] args) {

        Deque<String> aQueue = new ArrayDeque<>();
        ASnake snake = new ASnake("a", 50, 50);
        snake.fillArray(aQueue);
        snake.splitQueues(aQueue);
        System.out.println("\nOddList:\n" + snake.getOddList());
        System.out.println("\nEvenList:\n" + snake.getEvenList());
    }
}
