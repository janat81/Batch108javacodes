

    package day31_practicesession;

import java.util.Scanner;

    public class Q01ChangingLettersToAsterics {

        //Ask user to enter his/her name, surname and credit number and convert all characters in
        //name and surname to asterics except for the initials. Also convert all numbers in credit card to
        //asterics except for the last 4 digits

        public static void main(String[] args) {
            try {

                Scanner input = new Scanner(System.in);
                System.out.println("Enter your name, Surname and Credit Card Number");
                String str = input.nextLine();
                String name = str.split(" ")[0];
                String surname = str.split(" ")[1];
                String cardNum = str.split(" ")[2];
                String hiddenName = name.replaceAll("[a-z]", "*");
                String hiddenSurName = surname.replaceAll("[a-z]", "*");
                String hiddenNum = "";

                for (int i = 0; i < cardNum.length(); i++) {

                    if (i < cardNum.length() - 4) {

                        hiddenNum = hiddenNum + "*";
                    } else {
                        hiddenNum = hiddenNum + cardNum.charAt(i);
                    }
                }
                System.out.println(hiddenName + " " + hiddenSurName + " " + hiddenNum);
            }catch (Exception e){
                System.out.println("Please check your credentials again");
            }







        }

    }

