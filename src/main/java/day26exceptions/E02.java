package day26exceptions;

public class E02 {

    /*
       If you want to execute a code for every scenario use "finally" block after "try" body
       "try" can be used like
             i) try + single catch
             ii)try + multiple catch
             iii)try + single catch + finally
             iv) try + multiple catch + finally
             v) try + finally
       Note: "try" can not be used alone
       3) "ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundException", "NumberFormatException",
           "StringIndexOutOfBoundsException", "IllegalArgumentException" are displayed on the console after I click on "run" button
           therefore those are called "RunTime Exception"
       4) There is "Compile Time Exception", they will be displayed
     */

    public static void main(String[] args) {

        divide(6,2);

    }
    //Create a method to do division then save the result into the database
    public static void divide(int a,int b){

        try{

        System.out.println(a/b + "was saved into database");
        }catch(ArithmeticException e) {
            System.out.println("Do not use zero as divisor");
        }finally{
        System.out.println("cut the connection with the database");
    }
    }
}
