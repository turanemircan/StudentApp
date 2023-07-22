package StdPortal;

public class Student {
    private String studentNumber;
    private String name;
    private String surName;
    private String year;
    private String selectedLessons;
    private int debt;//borc


    public Student() {
    }

    public Student(String studentNumber, String name, String surName, String year) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.surName = surName;
        this.year = year;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSelectedLessons() {
        return selectedLessons;
    }

    public void setSelectedLessons(String selectedLessons) {
        this.selectedLessons = selectedLessons;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", year='" + year + '\'' +
                ", selectedLessons='" + selectedLessons + '\'' +
                ", debt=" + debt +
                '}';
    }
}