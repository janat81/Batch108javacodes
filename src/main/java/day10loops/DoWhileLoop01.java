package day10loops;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //While-loop
        int i=1;
        while(i<1){
            System.out.println("While loop");
            i++;
            //When you use While-loop zero execution is possible
        }

        //do-while loop
        int k=1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

      //1.Example:
        //Ask user to enter an integer. If the integer is less than 100,tell user "Won!"
        // Otherwise, tell user "Lost!"

        Scanner input = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter a number to play");
            num = input.nextInt();

         if (num < 100) {
                System.out.println("Won!");
            }
        }while(num>100);
        System.out.println("Lost!");


        }

    }

