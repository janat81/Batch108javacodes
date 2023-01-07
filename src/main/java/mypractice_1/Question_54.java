package mypractice_1;

import java.util.Scanner;

public class Question_54 {
    public static void main(String[] args) {
        //Type code by using while loop.
        // Get an integer from the user.
        // Find the sum of digits given by user.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String num= input.next();

        int sum=0;
        int i=0;
        while (i<num.length()){
            String x=num.substring(i,i+1);
            sum=sum+Integer.valueOf(x);
            i++;
        }
        System.out.println(sum);



    }
}
