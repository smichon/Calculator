package map_and_hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Przy użyciu wewnętrznego edytora Kodilli stwórz program z użyciem HashMap,
który będzie przechowywał dane uczniów oraz ich ocen.
Program ma wyświetlać średnią arytmetyczną ocen każdego ucznia.*/

public class Application {

    public static void main (String[] args) {

        Student student1 = new Student("John", "Doe", "1", new ArrayList<Integer>(Arrays.asList(2, 3, 1, 4, 5, 4)));
        Student student2 = new Student("Zachary", "Taylor", "2", new ArrayList<Integer>(Arrays.asList(3, 5, 6, 3)));
        Student student3 = new Student("Monica", "Kowalski", "3", new ArrayList<Integer>(Arrays.asList(2, 5, 1, 4, 3)));
        Student student4 = new Student("Robert", "Greenwood", "4", new ArrayList<Integer>(Arrays.asList(4, 5, 4, 2)));
        Student student5 = new Student("Monica", "Smith", "5", new ArrayList<Integer>(Arrays.asList(4, 4, 5, 3)));


        HashMap<Student, ArrayList<Integer>> studentGrades = new HashMap<Student, ArrayList<Integer>>();

        studentGrades.put(student1, student1.getGrades());
        studentGrades.put(student2, student2.getGrades());
        studentGrades.put(student3, student3.getGrades());
        studentGrades.put(student4, student4.getGrades());
        studentGrades.put(student5, student5.getGrades());


        for(Map.Entry<Student, ArrayList<Integer>> entry: studentGrades.entrySet()) {

            System.out.println(entry.getKey() + " has obtained following grades:\n" + entry.getValue() + "\nAverage value those of grades is: " + String.format("%.2f", entry.getKey().countAverage()) + "\n----------------");
        }
    }
}
