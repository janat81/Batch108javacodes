package mypractice_1;

public class Question_42 {
    public static void main(String[] args) {

    String r = "Tom";

    for (int i =r.length()-1; i>=0; i--){
        char letter = r.charAt(i);
        String reversed = "";
        reversed = reversed+letter;
        System.out.println(reversed);
    }
    }
}
