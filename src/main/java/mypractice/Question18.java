package mypractice;

public class Question18 {
    public static void main(String[] args) {


        // Get the initials of the first name and the last name of a given name. Mary Star==> MS

        String ins = "Mary Star";

        char fIn = ins.charAt(0);
        String sIn = ins.split(" ")[1].substring(0,1);
        System.out.println(fIn+sIn);

    }
}
