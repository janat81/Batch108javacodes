package day04nestedifswitch;

import java.util.Scanner;

public class NestedIfStatement01 {

    public static void main(String[] args) {

        /*
        Ask user to enter a password

        If the initial of the password is uppercase
        Check if it is 'A' or not.
        If it is 'A' the output will be  "Valid Password"
        otherwise the output will be "Invalid Password"
        For example, Ali==> Valid password    -   ali ==>      - Mark ==> Invalid

        If the initial of the password is lowercase
        Check if it is 'z' or not
        If it is 'z' the output will be "Valid Password"
        otherwise the output will be "Invalid Password"
        Foe example: zoe ==> Valid password        -      Zoe ==> Innvalid       -   John ==>  Invalid

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        char pwdInitial = input.next().charAt(0);

        if(pwdInitial>='A'  && pwdInitial<='Z') {

            if (pwdInitial == 'A') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }

        }else if(pwdInitial>='a' && pwdInitial<='z'){

            if(pwdInitial=='z') {
                System.out.println("Valid password");
            }else{
                System.out.println("Invalid password");
            }
        }else{
            System.out.println("Invalid password");
        }




    }

}
