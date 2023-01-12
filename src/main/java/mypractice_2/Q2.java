package mypractice_2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //Ask user to enter the number of the names he wants to insert using an Array.
        //Take the number of the elements and then print them.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of names");
        int numOfNames=input.nextInt();

        String names [] = new String[numOfNames];

        for (int i=0; i<numOfNames; i++){
            System.out.println("Enter the name "+(i+1)+".employee name. Please press 'Q' to quit the application");

            String employeeName=input.next();
            if (!employeeName.equalsIgnoreCase("Q")) {
                names[i] = employeeName;
            }else{
                break;
        }
            System.out.println(Arrays.toString(names));

        }
    }
}
