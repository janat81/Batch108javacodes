package day32_practicesession;

import java.util.Scanner;

public class Q01_ConvertingGivenNamesToAsterics {


        //Ask user to enter his/her name and credit card number and convert all the characters in name and surname to
        //asterics except for the initials and last 4 digits of credit card number.

        // Tom Hanks==> T** H*** Credit Card Number==> **** **** **** 6785

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name, surname and credit card number");

            String str = input.nextLine();

            String name = str.split(" ")[0];

            String surname = str.split(" ")[1];

            String cardNum = str.split(" ")[2];

            String hiddenName = name.replaceAll("[a-z]", "*");
            String hiddenSrName = surname.replaceAll("[a-z]", "*");

            String hiddenNum = "";

            for (int i = 0; i < cardNum.length(); i++) {

                if (i < cardNum.length() - 4) {

                    hiddenNum = hiddenNum + "*";

                } else {
                    hiddenNum = hiddenNum + cardNum.charAt(i);
                }
            }
            System.out.println(hiddenName + " "+ hiddenSrName + " " + hiddenNum);

        }
    }

