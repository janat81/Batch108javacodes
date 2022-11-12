package day05ternarystringmanipulations;

public class Nestedternary01 {

    public static void main(String[] args) {

        /*
        Type Java code by using nested ternary.
        Write a program to check if a year is "leap year" or not.
       i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+,1800-
       ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */

        int year = 1600;

        String isleap = year%100==0 ? (year%400==0 ? "Leap"  : "Not leap") : (year%4==0 ? "Leap" : "Not leap");

        System.out.println(isleap);

        /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it has no more than 8 characters initial should be 'K'
        Solve the task by using nested-ternary
         */

        String pwd = "ia1b3cXyz";

        String isValid = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid" : "Invalid") : (pwd.charAt(0)=='K' ? "Valid" : "Invalid");

        System.out.println(isValid);

    }
}
