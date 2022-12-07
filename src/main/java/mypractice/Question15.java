package mypractice;

public class Question15 {
    public static void main(String[] args) {
        // Type code to check the password. If it has more than 8 characters,initial should be'i'.
        //           If it has less than 8 characters, initial should be 'K'.

        String p = "i456789house";

        String pswrd = p.length()>8?(p.charAt(0)=='i'?"valid":"not valid"):(p.charAt(0)=='K'?"valid":"not valid");

        System.out.println(pswrd);

    }
}
