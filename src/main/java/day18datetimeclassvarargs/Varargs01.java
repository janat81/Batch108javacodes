package day18datetimeclassvarargs;

public class Varargs01 {

    /*
        1) If you want to make number of parameters flexible in a method use "varargs"
        2) To create a varargs "Data Type + ... + space + a name for the varargs".
        3) "Varargs" use Arrays behind. When we work with Varargs you may think you are working with Array
        4) "Varargs can accept zero or more elements.
        5) Can I use another regular parameter after "Varargs"?
           No, because "varargs" can not be made full, second parameter will be unreachable,it will give error.
           "Varargs" must be last parameter everytime.
        6) Can I use another regular parameter before Varargs?
           Yes, you can use many regular parameters before "Varargs"
        7) Can I use multiple varargs parameter in a method?
           No.


     */

    public static void main(String[] args) {

        System.out.println(add(3,5));//8
        System.out.println(add(3,5,2));//10
        System.out.println(add());//0
        System.out.println(add(3));//3
    }

    //Create a method add two integers
    public static int add(int... a){

        int sum = 0;
        for(int w : a){

            sum = sum + w;
        }
        return sum;
    }



}
