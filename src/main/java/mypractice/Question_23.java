package mypractice;

public class Question_23 {
    public static void main(String[] args) {

                // 23. Find the order number of last occurrence of "Java" in a sentence.
                String r = "I like to study Java,learn Java,earn money,Java is easy";

                int last = r.lastIndexOf("Java");
                System.out.println(last + 1);
            }
        }

