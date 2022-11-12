package day03ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If statement: We sometimes need to execute some codes under some specific conditions
        //If it rains I will cancel the picnic.

        //Example1: Type code to print negative for the numbers less than zero and non- negative for the numbers greater than or equal to zero

        double d = 2.3 ;
        if(d<0){
            System.out.println("Negative");
        }
        if(d>=0){
            System.out.println("Non-negative");
        }
        //Note: "%" in Java is an operator  gives you the remainder in division operation
        //      "%" is called "modulus" operator

        //Note: "==" checks equality like single = sign in Math

        //Note: "!" in Java means "not"
        //       !true ==> false      !false ==> true    !!true==>true

        //Example2: Type code to print "Divisible by 5" if the number can be divided by 5, otherwise print "Not Divisible by 5"if the number cannot be divided by 5
       //1.Way: Multiple if statement
        int i = 17;
        if(i%5==0){
            System.out.println("Divisible by 5");
        }
        if(i%5 !=0){
            System.out.println("Not divisible by 5");
        }

        //2.Way: if else statement=> Use it if you have just two conditions.
        // In the second way Java checked just one condition. But in the first way Java is checking 2 conditions.
        //       No repetition. Quicker code execution.
        int k = 17;
        if(k%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }
    }
}
