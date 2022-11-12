package day01variables;

public class Variables01 {

    public static void main(String[] args) {




        //Data Type    Variable Name    =    Value   ;
        int age = 27;

        //Example1: Create a variable whose value is 1.99
        double priceOfShirt = 1.99;

        //Data Type
       /*1) Integer: It is used for whole numbers.
       min -2.147.483.648
       max 2.147.483.648
       Integer variables use 32 bits in memory

       2)short: It is used for whole numbers.
       The minimum value of shorts is -32,768
       The maximum value of shorts is 32,767
       short valuables use 16 bits in memory

       3)byte: It is used for whole numbers.
       The minimum value of bytes is -128
       The maximum value of bytes is 127
       bytes valuables use 8 bits in memory

       4)long: It is used for whole numbers.
       The minimum value of long is -9,223,372,036,854,755,808
       The maximum value of long is 9,223,372,036,854,755,808
       long valuables use 64 bits in memory

       Note: When you select any Data Type the value must be in the range of the Data Type.
        */

        int populationOfGermany = 80000000;
        System.out.println(populationOfGermany);

        long populationOfTheWorld = 7000000000L ;
        long populationOfChina = 1400000 ;

        byte ageOfStudent = 23 ;
        System.out.println(ageOfStudent);

        short populationOfTheVillage = 23000;
        System.out.println(populationOfTheVillage);


        //Example2: Create an Integer variable and 2 double variables then print their sum on the console

        String name = "Tom Hanks" ;


        int shirt = 21 ;
        double shoes = 12.99 ,socks = 3.99 ;
        System.out.println(shirt+shoes+socks);

        //Example3: Create 2 float variables, 3 short variables, 2 double variables and print their sum on the console.

        float f1 = 12.99F, f2 = 5.76F;
        short s1 = 12, s2 = 23, s3 = 34 ;
        double d1 = 23.45 , d2 = 123.09 ;

        System.out.println(f1+f2+s1+s2+s3+d1+d2);

        //Example4: Create a char variable and an integer variable and try to do addition operation with them.

        char c1 = 'A' ;
        int i1 = 10 ;
      //When you use any char in any math operation Java uses the ASCII value of the char
        System.out.println(c1+i1);

        //Example5: Create a String variable and 2 integer variables and try to do addition operation with them.

        String s = "Tom" ;
        int i = 12 , k = 23 ;

        System.out.println(s+i+k);

        //What if I want to see Tom35
        System.out.println(s+ (i+k));

        // If you use + sign with a string Java will do concatenation operation.
        // In concatenation operation data will be joined.


    }
}















