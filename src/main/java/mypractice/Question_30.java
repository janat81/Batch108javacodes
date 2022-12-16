package mypractice;

public class Question_30 {
    public static void main(String[] args) {
        // Check if a string has just letters and spaces in it.
        String f = "I want to be very good at ? Java";
         boolean ch = f.replaceAll("[a-zA-Z0-9 ]","").isEmpty();
        System.out.println(ch);
    }
}
