package mypractice;

public class Question10 {

    public static void main(String[] args) {


        int a = 25;
        if(a>=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        int b=-2;
        String num = b>=0?"positive":"negative";
        System.out.println(num);

    }
}
