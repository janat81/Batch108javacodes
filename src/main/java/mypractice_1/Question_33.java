package mypractice_1;

import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {

  // Ask user to enter two numbers then swap them.

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a = input.nextInt();

        System.out.println("enter a number");
        int b = input.nextInt();

        b = b-a;
        a = a+b;
        b = a-b;
        System.out.println(a + " and " + b);




    }
}
