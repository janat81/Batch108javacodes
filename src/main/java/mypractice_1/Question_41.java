package mypractice_1;

public class Question_41 {
    public static void main(String[] args) {


        String u = "Hello";


        for (int i=0; i<u.length(); i++) {

            if (u.indexOf(u.charAt(i)) == u.lastIndexOf(u.charAt(i))) {
                System.out.println(u.charAt(i));
            }
        }
    }
}
