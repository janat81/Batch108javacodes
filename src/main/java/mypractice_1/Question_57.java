package mypractice_1;

import java.util.Scanner;

public class Question_57 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int counter=0;

        do{
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your username");
            String username=input.next();
            System.out.println("Enter your password");
            String password = input.next();
            counter++;
            if (username.equals("admin")&&password.equals("pwd123")){
                System.out.println("You are in your account");
                break;
            }
        }while (true);
    }
}
