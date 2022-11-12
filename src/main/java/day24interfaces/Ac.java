package day24interfaces;

   /*

      1) An interface can not have "concrete method"
      2) All methods in an interface are "public" and "abstract" as default
         Because of that, even if you do not declare the methods, they will be "public" and "abstract"

              public abstract void digital(); and
                              void digital(); are same

      3) If "parent interfaces" have methods with the same name overriding just one of them will be enough.

      4) "parent interfaces" can not have methods with the same name and different return types.
         If you do that, Java will give you compile time error
       5) Variables in an interface are "public", "static" and "final".

         "public static final int price = 2300;" and "int price = 2300;"
        6) "Variables" in interfaces are "static" default, therefore no need to create object to access
           variables in interfaces
        7) Whenever you need to call any variable use Interface name to call

        8) "Class" parent of another "Class" ==> extends
           "Interface" parent of another "Interface" ==> extends

           "Interface" parent of  "Class" ==> implements
           "Class" parent of "Interface" ==> impossible. ==> An "Interface" can have "just" Interface as parent
    */

public interface Ac {

    public abstract void digital();

    void price();

     int price =2300;

     String name = "Perfect AC";

     //To create "concrete method" in an Interface you have 2 options:
    //            1. Use "default" keyword
    //            2. Use "static" keyword


    //1. Use "default" keyword
    public default int calculate(){
        return 1200;
    }

    //1. Use "static" keyword
    public static boolean climate(){
        return true;
    }

}




