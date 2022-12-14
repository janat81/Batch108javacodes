package mypractice;

public class Question19_20_21 {
    public static void main(String[] args) {
        // Type code to find the number of words in a String.

        String num = "I like to move it move it";

        int words = num.split(" ").length;
        System.out.println(words);

        //20. Type code to see the order number of the first occurrence of the character 'a' in a String.

        String a = "I want to learn Java";

        int order = a.indexOf('a');

        System.out.println(order +1);

        // 21. Type code to see the order number of the first occurrence of "Java" in the given String.
         String b = "I want to learn Java";
         int java = b.indexOf("Java");
        System.out.println(java+1);







    }
}
