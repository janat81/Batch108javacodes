package day04nestedifswitch;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        String p = "iavjdkd1234";

        String pswd = p.length()>8 ? (p.charAt(0)=='i'?"Valid":"Invalid"):(p.charAt(0)=='K'? "Valid": "Invalid");
        System.out.println(pswd);



        }
        }






