package day27exceptionscollections;

public class CustomExceptions01 {
/*
     Normally, Java has many Exception classes which cover many issues
        Sometimes we need custom exceptions for 2 reason:
     1) to make Java Exceptions more specific.
       "FileNotFoundException" has 2 reasons in it: i) path can be wrong  ii) file does not exist
     2) to create some Exceptions for our application
       "IllegalGradeException" can be created for a school management system application
     3) Custom exceptions directs the developers not to break the application rules
*/

    public static void main(String[] args){

        try {
            printGrades(45);
        } catch (IllegalGradeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(checkNameFormat("Tom"));

    }
    public static void printGrades (double grade) throws IllegalGradeException {

        if(grade<0 || grade>100) {
            throw new IllegalGradeException("Grades cannot be less than zero or more than hundred");
        }else{
            System.out.println(grade);
        }
    }
    public static boolean checkNameFormat(String name){

        if(name.charAt(0)>='A' && name.charAt(0)<='Z') {
            return true;
        }else{
            throw new IllegalNameException("Names must start with uppercases");
        }
    }
    }










