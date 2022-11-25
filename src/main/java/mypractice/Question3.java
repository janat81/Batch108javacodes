package mypractice;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Type code to print "weekday" for the weekday names and "weekend day" for the weekend day names.


        String day = "Sam";

        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")
                 ||day.equalsIgnoreCase("Thursday")||day.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend day");
        }else{
            System.out.println("not expected data");
        }
    }
}











