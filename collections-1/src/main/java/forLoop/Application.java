package forLoop;

/*Napisz program obliczający wartość średnią 20 elementów tablicy.*/

public class Application {

    public static void main (String[] args) {

        ArithmeticMean average = new ArithmeticMean();
        average.createArray();
        average.displayArray();
        average.countAverage();
    }
}
