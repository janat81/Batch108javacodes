package mypractice;

public class Question16 {
    public static void main(String[] args) {

        // Print the first and the last character of the given String
        String s = "Java is easy";

        char firstCh = s.charAt(0);
        System.out.println(firstCh);

        String secondCh = s.substring(s.length()-1);
        System.out.println(secondCh);

        System.out.print(firstCh + secondCh);

    }
}
