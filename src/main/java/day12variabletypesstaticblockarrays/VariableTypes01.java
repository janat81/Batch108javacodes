package day12variabletypesstaticblockarrays;

public class VariableTypes01 {

    //"name" is "non-static" or "object" or "instance" variable

    public String name = "Tom Hanks";

    //"age" is static or "class" variable
    public static int age = 13;

    // local variable
    //If you create a variable inside a method it is called
    // "local variable"
    // When you create a local variable it is mandatory to assign a value.
    // If you try to use local variable without assigning a value it complains
    // If the return type is different from "void" you have to use "return" keyword inside the method
    public int add(int a, int b) {

        int x = 12; // this is variable

        return a+b;

    }

    //Create a method to do multiplication

    public int multiply(int c, int d){

        String s = "Java";

        return c*d;
    }

}
