package mypractice_2;

public class Q1 {
    public static void main(String[] args) {
        //Type code to check if a given String is palindrome or not.

        String one="Nalan";
        String rev="";

      int idx=one.length()-1;
        System.out.println(idx);
        while (idx>-1){
            rev=rev+one.charAt(idx);
            idx--;
        }
        System.out.println(rev);
        if (one.equals(rev)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
    }
}
