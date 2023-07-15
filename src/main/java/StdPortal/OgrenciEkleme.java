package StdPortal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciEkleme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of students you're registering");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents > 0) {

            for (int i = 1; numberOfStudents >= i; i++) ;

            if (numberOfStudents / 2 == 1 / 2) {

                System.out.println(numberOfStudents + " student registered");

            } else if (numberOfStudents / 2 != 1 / 2) {

                System.out.println(numberOfStudents + " students registered");

            }

        } else if (numberOfStudents < 0) {

            while (numberOfStudents < 0) {

                System.out.println("Invalid answer");
                System.out.println("Can't remove students from register");
                System.out.println("Try again");
                numberOfStudents = input.nextInt();
            }

            if (numberOfStudents > 0) {

                for (int i = 1; numberOfStudents >= i; i++) ;

                if (numberOfStudents / 2 == 1 / 2) {

                    System.out.println(numberOfStudents + " student registered");

                } else if (numberOfStudents / 2 != 1 / 2) {

                    System.out.println(numberOfStudents + " students registered");

                }

            }

        } else if (numberOfStudents == 0) {

            System.out.println("No student was added to the register");

        } else {

            System.out.println("Invalid answer");
            System.out.println("Not an integer");

            try {
                System.out.println("Tip: When asked for amount, use numbers to answer");
            } catch (InputMismatchException e) {
                System.out.println("You're logged out of the registering system by the reason: Failed to acknowledge tip");
                System.out.println("");
                System.out.println("");
                System.out.println("---------------[ LOGGED OUT PLEASE TRY AGAIN LATER ]---------------");
            }
        }
    }


}
