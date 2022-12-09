package mypractice;

public class Question17 {
    public static void main(String[] args) {

        // Print just the fruit names
       String s = "We buy apples, pears, figs and oranges.";

     String apples = s.substring(7,13);
     String  pears = s.substring(15,20);
     String figs = s.substring(22,26);
     String oranges = s.substring(31);

        System.out.print(apples+pears +figs+oranges);


    }
}
