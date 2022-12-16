package mypractice;

public class Question_27 {
    public static void main(String[] args) {

    // Check if a password is valid or not for the following conditions.
        // 1. Must have at least 8 characters different from space
        // 2. Must have at least one symbol.

        String s = "dr?house";

        boolean one = s.replaceAll("\\s","").length()>7;
        boolean two = s.replaceAll("\\s"," ").replaceAll("[a-zA-Z0-9]"," ").length()>0;


        System.out.println(one&&two);



    }
}
