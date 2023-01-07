package mypractice_1;

import java.util.Scanner;

public class Question_54_1 {
    public static void main(String[] args) {
        // Sum of digits
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int digit=input.nextInt();

        int sum =0;

        while (digit>0){
            sum=sum+digit%10;
            digit=digit/10;
        }
        System.out.println(sum);
    }
}
