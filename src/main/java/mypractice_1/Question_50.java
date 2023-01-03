package mypractice_1;

import java.util.Scanner;

public class Question_50 {
    public static void main(String[] args) {

       for (int i=0; i<3; i++){
           System.out.println("*****");

       }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter column");
        int column = input.nextInt();

        System.out.println("Enter row");
        int row = input.nextInt();

        for (int c=1; c<=column; c++){

            for (int r = 1; r<=row; r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
