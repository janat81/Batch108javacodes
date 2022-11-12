package day10loops;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

/*
         Example 1: Type code to get the output like:
         Week : 1
               Day : 1
               Day : 2
               Day : 3
               .....
         Week : 2
               Day : 1
               Day : 2
               Day : 3
               .....
         Week : 3
               Day : 1
               Day : 2
               Day : 3
               .....
         */
        for(int i = 1; i<5; i++){

            System.out.println("Week "+i);

            for(int k=1;k<8;k++){
                System.out.println("   Day "+k);




                /*
                 2.Example: Write a Java Program to print Rectangle Star Pattern using For Loop
                            ****
                            ****
                            ****

                  Note: Get the number of the rows and the columns from user
         */
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number of the rows");
                int row = input.nextInt();
                System.out.println("Enter the number of the columns");
                int column = input.nextInt();



                }
            }
        /*
        3.Example: Type code to get  the output like
        1
        12
        123
        1234
        12345
         */

        System.out.println("Enter the number of the rows");

        }



    }


