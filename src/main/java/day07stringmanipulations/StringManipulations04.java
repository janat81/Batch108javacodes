package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data in Java";

        boolean result1 = str.isEmpty(); //str.length()==0 is same with isEmpty,but to check if string is empty isEmpty is preferable
        System.out.println(result1);

        //isEmpty("") ==>true, isEmpty("  ")==>false
        //isBlank("") ==>true, isBlank("  ")==>true

        //Example 1: Check if a String has justletters and spaces in it

        String s = "Learn Java earn money";

        boolean result3 = s.replaceAll("[a-zA-Z ]","").isEmpty();
        System.out.println(result3);

        //Example2: Check the SSN for the following rules
        //          1) It must have just digits
        //          2) It must have 9 digits

        String ssn = "123A45678";

        //It must have just digits
        boolean firstRule = ssn.replaceAll("[0-9]","").isEmpty();

        //It must have 9 digits
        boolean secondRule = ssn.length()==9;

        if(firstRule && secondRule) {
            System.out.println("Valid ssn");
        }else{
            System.out.println("Invalid ssn");
        }

    }
}
