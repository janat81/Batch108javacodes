package mypractice;

public class Question_26 {
    public static void main(String[] args) {
        // Change all digits to "*" in the given String.

        String str = "Ali is 1673 years old I think he looks 1895.";

        String result = str.replaceAll("[0-9]","*");
        System.out.println(result);
    }
}
