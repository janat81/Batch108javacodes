package day03ifstatement;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Example1: Get first,middle and the last names and social security number from the user then print them like the given format
        //          Tom Jim Hanks
        //          234567891

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your middle name");
        String middleName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Enter your ssn name");
        String ssnName = input.next();

        System.out.println(firstName+" "+middleName+" "+lastName);
        System.out.println("Enter your SSN");




    }
}
