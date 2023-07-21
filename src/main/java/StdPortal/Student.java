package StdPortal;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surName;
    private List< Course > selectedLessons=new ArrayList<>();
    private String studentNumber;
    private int debt;
    private String  year;
    private static int counter =0;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Course> getSelectedLessons() {
        return selectedLessons;
    }

    public void setSelectedLessons(List<Course> selectedLessons) {
        this.selectedLessons = selectedLessons;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", selectedLessons=" + selectedLessons +
                ", studentNumber='" + studentNumber + '\'' +
                ", debt=" + debt +
                ", year='" + year + '\'' +
                '}';
    }
}
