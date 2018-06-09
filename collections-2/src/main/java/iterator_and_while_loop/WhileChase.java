package iterator_and_while_loop;

import java.util.Random;

public class WhileChase {

    private int sumaA;
    private int sumaB;
    private int counter = 0;
    private Random generator = new Random();

    public WhileChase(int sumaA, int sumaB) {
        this.sumaA = sumaA;
        this.sumaB = sumaB;
    }

    public int getSumaA() {
        return this.sumaA;
    }
    public int getSumaB() {
        return this.sumaB;
    }

    public void randomValues() {

        while(sumaA > sumaB) {
            counter++;
            sumaA = sumaA + generator.nextInt(10);
            sumaB = sumaB + generator.nextInt(50);
            System.out.println("\nRepetition " + counter + ", SumaA = " + sumaA + ", SumaB = " + sumaB);
        }

        System.out.println("-------------\nNow SumaB is greater than SumaA");
    }
}
