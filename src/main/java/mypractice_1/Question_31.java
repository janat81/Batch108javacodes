package mypractice_1;

public class Question_31 {
    public static void main(String[] args) {

        // Check SSN for the following rules:
        //          1. Must have just digits.
        //          2. Must have 9 digits.

        String dgt = "o23456789";

        boolean f = dgt.replaceAll("[0-9]","").isEmpty();
        boolean s = dgt.length()==9;
        if(f&&s){
            System.out.println("Valid");
        }else{
            System.out.println("invalid");
        }


    }
}
