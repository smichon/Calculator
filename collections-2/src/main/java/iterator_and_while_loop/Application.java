package iterator_and_while_loop;

/*Napisz program, który:
będzie posiadał zmienną int sumaA (zainicjowana z wartością 1000)
oraz drugą zmienną int SumaB (zainicjowana z wartością 0).
Pętle while, wewnątrz której losujemy:
liczbę typu int z zakresu 0-9 i dodawaj ją do zmiennej sumaA oraz
liczbę typu int z zakresu 0-49 i dodawaj ją do zmiennej sumaB.
Pętlę wykonuj tak długo, jak długo spełniony jest warunek sumaA > sumaB.
W każdej iteracji wyświetl numer przebiegu pętli oraz aktualne wartości obu zmiennych.*/

public class Application {

    public static void main (String[] args) {

        WhileChase object = new WhileChase(1000, 0);
        object.randomValues();
    }
}
