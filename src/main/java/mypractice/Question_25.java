package mypractice;

public class Question_25 {
    public static void main(String[] args) {
        //Check if the given password
        // 1. has "A" in any position
        // 2. "xy" at the beginning
        // 3. "W" as 7th character
        // 4. has 8 characters in total

        String p = "xyA456W8";

        boolean one = p.length()==8;
        boolean two = p.startsWith("W",6);
        boolean three = p.startsWith("xy");
        boolean four = p.contains("A");

        System.out.println(one&&two&&three&&four);

    }
}
