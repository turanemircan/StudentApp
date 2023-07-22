package StdPortal;

import java.util.Scanner;

public class OgrenciEkleme {

    Scanner inp=new Scanner(System.in);
    StudentRepository repository=new StudentRepository();
    public void createTable(){
        repository.createTable();
    }

    public void addStudent() {

        System.out.println("Ad : ");
        String name = inp.nextLine().trim().toLowerCase();
        System.out.println("Soyad : ");
        String lastname = inp.nextLine().trim().toLowerCase();
        System.out.println("Yil : ");
        String year = inp.nextLine().trim().toLowerCase();
        String no = studentNumber(year);
        inp.nextLine();
        Student newStudent = new Student(no, name, lastname, year);
        repository.save(newStudent);
    }

    public static String studentNumber(String year) {
        int sabitNo=0;
        String no = String.format("%s%04d", year, sabitNo);
        sabitNo++;
        return no;
    }
}