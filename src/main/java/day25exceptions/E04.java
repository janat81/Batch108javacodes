package day25exceptions;

public class E04 {

    public static void main(String[] args) {

        int r1 = convertStringToInt("123");
        System.out.println(r1 + 1); //124

        int r2 = convertStringToInt("abc");//NumberForMathException: If you use "valueOf()" method with a String has non-digit character in it,
                                           // you will have NumberFormatException
        System.out.println(r2 + 1);

    }

    // Create a method to Convert a String to an Integer
    public static int convertStringToInt(String str) {
        int i=0;

        try{
            i = Integer.valueOf(str);
        }catch(NumberFormatException e){
            System.out.println("A problem occurred while I convert the String to Integer - " + e.getMessage());

        }
        return i;

}

}
