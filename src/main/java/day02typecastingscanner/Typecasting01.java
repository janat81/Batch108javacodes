package day02typecastingscanner;

public class Typecasting01 {

    public static void main(String[] args) {

        //Example1: Create 2 integer variables and 1 string variable.
        int i = 13, k = 21;

        String s = "Tom" ;

        System.out.println(i+k+s);

        System.out.println(s+i*k);

        /* Order of operations in math
        1) Claclulate the exponentials.
        2) Do the operations inside the paranthesis.
        3) Do multiplications and divisions.
        4) Do additions and subtractions.

         */
        int result = 3-2+(5+2*3)/11;
        System.out.println(result);

        //Type Casting
        /* AutoWidening

         */
        int m =14;
        System.out.println(m);

        double d = m;
        System.out.println(d);

        /*
        Explicit Narrowing
        Java does not put large data into small data types
         */
        int n = 15;

        byte b = (byte)n;
    }

}
