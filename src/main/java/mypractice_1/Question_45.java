package mypractice_1;

public class Question_45 {
    public static void main(String[] args) {

   int sum = 0;
   for (int i= 1589; i>0; i=i/10){
     sum= sum+ i%10;
   }
        System.out.println(sum);

    }
}
