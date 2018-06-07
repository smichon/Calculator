package forLoop;

public class ArithmeticMean {

    private double sum = 0;
    private int values[] = new int[20];
    private double mean;

    public void createArray() {

        values[0] = 2;
        values[1] = 5;
        values[2] = 8;
        values[3] = 1;
        values[4] = 4;
        values[5] = 7;
        values[6] = 3;
        values[7] = 6;
        values[8] = 9;
        values[9] = 1;
        values[10] = 5;
        values[11] = 9;
        values[12] = 7;
        values[13] = 5;
        values[14] = 3;
        values[15] = 5;
        values[16] = 16;
        values[17] = 12;
        values[18] = 20;
        values[19] = 5;
    }

    public void displayArray() {

        System.out.println("This program is prepared to show how works loop FOR.\nArray elements:");

        for(int i=0; i < values.length; i++) {
            System.out.println("values[" + i + "] = " + values[i]);
            sum = sum + values[i];
        }
    }

    public void countAverage() {

        double mean = sum / values.length;
        System.out.println("_______________\nArray length is: " + values.length + "\nSum of elements of array: " + sum + "\nArithmetic mean of elements in array is: " + mean);
    }
}
