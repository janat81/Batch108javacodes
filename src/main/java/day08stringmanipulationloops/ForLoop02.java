package day08stringmanipulationloops;

public class ForLoop02 {

    public static void main(String[] args) {

        String str = "Java";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"*");
        }

        System.out.println();

       String h = "Hello";

       for(int i=0; i<h.length(); i++){
           if(h.indexOf(h.charAt(i))==h.lastIndexOf(h.charAt(i))){
               System.out.print(h.charAt(i));
           }
       }
    }

}
