package mypractice;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a country name");

        String country = input.nextLine();

        switch (country.toLowerCase()){
            case "england" :
                System.out.println("EN");
                break;
            case "france" :
                System.out.println("FR");
                break;
            case "kazakhstan" :
                System.out.println("KZ");
                break;
            default:
               System.out.println("unexpected name");

        }


    }
}
