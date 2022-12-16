package mypractice;

import java.util.Scanner;

public class Question_29 {
    public static void main(String[] args) {
        // Ask user to enter his full name and fix if the user enters space at the beginning and at the ending.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = input.nextLine();

        String fixed = name.trim();
        System.out.println(fixed);
    }
}
