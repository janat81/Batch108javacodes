package mypractice_1;

import java.util.Scanner;

public class Question_55 {
    public static void main(String[] args) {

  Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int i = 1;
        while (i<11){
            System.out.println(num+"*"+i+"="+num*i);
            i++;
        }


    }
}
