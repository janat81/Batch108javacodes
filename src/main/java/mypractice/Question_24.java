package mypractice;

public class Question_24 {
    public static void main(String[] args) {

        // Check if a character is unique in a String or not.
        String u = "Hello";

      if(u.indexOf('l')==-1) {
          System.out.println("the character does not exist");
      }else if(u.indexOf('l')==u.lastIndexOf('l')){
          System.out.println("unique");
      }else{
          System.out.println("not unique");
      }

        }
}
