package mypractice;

import java.util.Scanner;

public class Now {

    public static void main(String[] args) {
        //Make it reverse:
        // Find the sum of integers from 3 to 6:
        // Find the multiplication of the integers:
        // Type code to find the sum of the digits of an Integer: 584
        // Print characters except 'm' in a String:
        // Print characters before 'm' in a String:
        // Find the sum of the unique digits in an Integer:

        Scanner input = new Scanner(System.in);
        System.out.println("enter nm of rows and colomns");
        String rows = input.next();
        System.out.println(rows);

        String colomns = input.next();
        System.out.println(colomns);

        for(int r = 1; r<rows.length();r++){
            System.out.print("*"+r);
            for(int c=1; c<colomns.length(); c++){
                System.out.println("*" +c);
            }
        }

    }
}
