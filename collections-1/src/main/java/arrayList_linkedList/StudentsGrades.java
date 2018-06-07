package arrayList_linkedList;

import java.util.ArrayList;

public class StudentsGrades {

    private double sum;
    private int min;
    private int max;
    private double average;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public void getGrades() {

        grades.add(2);
        grades.add(3);
        grades.add(1);
        grades.add(4);
        grades.add(5);
        grades.add(4);
        grades.add(3);
        grades.add(5);
        grades.add(6);
        grades.add(3);
        grades.add(2);
        grades.add(5);
        grades.add(1);
        grades.add(4);
    }

    public void findMinAndMax() {

        min = grades.get(0);
        max = grades.get(0);
        for(int i: grades) {
            sum = sum + i;
            if(i < min) {
                min = i;
            } else if(i > max) {
                max = i;
            }
        }
        System.out.println("Collection size is: " + grades.size()+ "\nExtreme values are: " + min + " and " + max);
    }

    public void countAverage() {

        grades.remove(min);
        grades.remove(max);
        System.out.println("Removing 2 extreme values\nNew collection size: " + grades.size());
        average = (sum - (min + max)) / grades.size();
        System.out.println("Average of grades is: " + String.format("%.2f", average));
        System.out.println("________________\n");
    }
}
