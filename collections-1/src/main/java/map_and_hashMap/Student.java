package map_and_hashMap;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    private String licenseId;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String firstName, String lastName, String licenseId, ArrayList<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenseId = licenseId;
        this.grades = grades;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    @Override
    public boolean equals(Object o) {

        final Student s = (Student) o;
        return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName) && this.licenseId.equals(s.licenseId);
    }

    public int hashCode(){
        return Integer.parseInt(licenseId.substring(0));
    }

    public String toString(){
        return  lastName + " " + firstName + ", ID No. - " + licenseId;
    }

    public double countAverage() {

        double sum = 0;

        for(int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}
