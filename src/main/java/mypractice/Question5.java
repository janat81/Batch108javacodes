package mypractice;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
     char p = input.next().charAt(0);

     if(p>='A'&& p<='Z'){
         if(p=='A'){
             System.out.println("Valid");
         }else{
             System.out.println("Invalid");
         }
     }else if(p>='a'&& p<='z') {
         if (p == 'z') {
             System.out.println("Valid");
         } else {
             System.out.println("Invalid");
         }
     }else{
         System.out.println("Invalid");

         }
     }



    }

