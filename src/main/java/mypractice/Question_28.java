package mypractice;

public class Question_28 {
    public static void main(String[] args) {
        // How many pucntuation marks are used?
        String s= "Ali is 13, I , have , many , apples .";

        int all = s.length();
        System.out.println(all);

        int punc = s.replaceAll("\\p{Punct}","").length();
        System.out.println(all-punc);

    }
}
