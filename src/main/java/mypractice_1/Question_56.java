package mypractice_1;

import java.util.Scanner;

public class Question_56 {
    public static void main(String[] args) {

        // Find the sum of digits

        Scanner input = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter a number");
            num= input.nextInt();
            if (num<100){
                System.out.println("Won!");
            }
        }while (num<100);
        System.out.println("Lost!");
    }
}
