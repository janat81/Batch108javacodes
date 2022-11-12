package day07stringmanipulations;

public class StringMnipulations02 {
    public static void main(String[] args) {

        String str = "Java is OOP";

        String result1 = str.replace('O','*');
        System.out.println(result1);

        String result2 = str.replace("Java", "*");
        System.out.println(result2);

        String st = "Ali is 234 years old, I think he looks 567";

        //Example 1: Change all digits to "*" in the given String

        //1.Way: Not recommended, because there is repetition
        String result3 = st.replace('0','*').
                            replace('1','*').
                            replace('2','*').
                            replace('3','*').
                            replace('4','*').
                            replace('5','*').
                            replace('6','*').
                            replace('7','*').
                            replace('8','*').
                            replace('9','*');

        System.out.println(result3);

        //2.Way: Recommended:
        String result4 = st.replaceAll("[0-9]","*");
        System.out.println(result4);

       //Example 2: Type code to check if a password is valid or not for the following conditions;
        //          Password must have at least 8 characters different from space character
        //          Password must have at least one symbol

        String pwd = "a1 !2   s  def ";

        boolean firstRule = pwd.replaceAll("\\s","").length()>7;

        boolean secondRule = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;


        //boolean secondRule = pwd.replaceAll("\\s","").replaceAll("[a-zA-Z0-9]","").length()>0;
        // instead of typing like this,that is 2 times replace(), we can put space after "9" like in above second rule
        System.out.println("Is the password valid? " + (firstRule && secondRule));


    }


}
