package mypractice_1;

public class Question_47 {
    public static void main(String[] args) {

        String s= "Luxembourg";

     for (int i=0; i<s.length(); i++){
           char res = s.charAt(i);

           if (res=='m'){
               break;
           }
         System.out.println(res);
     }

    }
}