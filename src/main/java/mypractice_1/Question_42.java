package mypractice_1;

public class Question_42 {
    public static void main(String[] args) {
        // Type code to reverse a string
        String m = "Mark";

        String last = "";

        for (int i=m.length()-1;i>=0; i--){
            char reversedLetters = m.charAt(i);
            last = last + reversedLetters;

        }

        System.out.println(last);

    }
}
