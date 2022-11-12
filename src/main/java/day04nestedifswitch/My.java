package day04nestedifswitch;

import java.util.Scanner;

public class My {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");

        char pswdInitial = input.next().charAt(0);

        if((pswdInitial>='A') && (pswdInitial<='Z')){
            if(pswdInitial=='A') {
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }

        if((pswdInitial>='a') && (pswdInitial<='z')) {
            if (pswdInitial == 'z') {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
