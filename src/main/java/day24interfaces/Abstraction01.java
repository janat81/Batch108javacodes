package day24interfaces;

public abstract class Abstraction01 {

    /*
     Final keyword is very important in Java
     1)"Final" keyword can be used for variables
        public final int age = 12;
        If you make a variable "final" you cannot change it's value
        "final variables" must be initialized.

     2)"final" keyword can be used for methods
       "final method" body can not be updated

     3)"final" keyword can be used for classes
       "final classes" can not have child classes

       Note: abstarct classes have something to do for child classes.
            If there is no child classes having to do list is not sensible
            "final classes" can not have child classes,therefore Java does not allow to make an abstract class final

      Note: "final method" body will be under protection by Java, because it should not be updated.
           But abstract methods do not have body, Java will look for the body to protect when it can not find it, it will complain


     */

    public int age;
    public static final double pi = 3.14;
}
