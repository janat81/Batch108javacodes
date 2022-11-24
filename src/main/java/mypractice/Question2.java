package mypractice;

public class Question2 {

    public static void main(String[] args) {

        // Type code to print divisible by 5 if it can be otherwise print not divisible

        int div = 47;

        if(div%5==0){
            System.out.println("divisible by 5");

        }else{
            System.out.println("not divisible by 5");
        }

        String rslt = div%5==0 ? "divisable" : "not divisible";
        System.out.println(rslt);

    }

}
