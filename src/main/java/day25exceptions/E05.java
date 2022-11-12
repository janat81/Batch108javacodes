package day25exceptions;

public class E05 {

    public static void main(String[] args) {

      int r1 = getCharFromString("Java",0);
        System.out.println(r1);//StringIndexOutOfBoundsException: If you use non-existing index for a String, you will get StringIndexOutOfBoundsException

    }
    //Create a method to get any character from a String
    public static char getCharFromString(String str,int idx){

        try{
            str.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A problem occurred - " + e.getMessage());
        }
       return str.charAt(idx);
    }
}
