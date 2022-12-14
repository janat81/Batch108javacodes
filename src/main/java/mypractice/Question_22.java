package mypractice;

public class Question_22 {

    public static void main(String[] args) {

   // 22. Check if a String has 'a' in it or not. Print appropriate messages for the scenarios.

        String v = "I want to learn Java";

        if(v.contains("a")){
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }
        String yes = v.contains("a")? "VAR":"YOK";
        System.out.println(yes);




    }
}
