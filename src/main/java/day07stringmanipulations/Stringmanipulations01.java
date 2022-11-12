package day07stringmanipulations;
public class Stringmanipulations01 {
    public static void main(String[] args) {

       String str = "Java is easy";
       boolean isExist = str.contains("a");
       System.out.println(isExist);
       boolean result = str.startsWith("J");
        System.out.println(result);

        //If you use stratsWith() method with two parameters, second parameter means skip the first characters

        boolean res = str.startsWith("i", 5);
        System.out.println(res);

       /*
       Example 1: Check if the given password
                 i) has "A" in any position
                 ii) has "xy" at the beginning
                 iii) has "W" as 7th character
                 iv) has 8 characters in total
        */
        String pwd = "xy1AmSW?";
        //i) has "A" in any position
        boolean firstRule = pwd.contains("A");
        //ii) has "xy" at the beginning
        boolean secondRule = pwd.startsWith("xy");
        //iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("w",6);
        //iv) has 8 characters in total
        boolean forthRule = pwd.length()==8;
        System.out.println("Is the password valid?" +  (firstRule && secondRule&& thirdRule && forthRule));


        String s = "Do practice to be better";
        boolean rslt = s.endsWith("better");

        System.out.println(rslt);

        String t = s.concat("!").concat("..."); // concat() method is same with "+" in Java
                                      //If you use multiple methods side by side it is called method chain

        System.out.println(t); //Do practice to be better!...


    }
}
