package mypractice_1;

public class Question_32 {

    public static void main(String[] args) {

      // Find the sum of the book and shirt prices

        String sh = "$12.99";
        String b = "$35.99";


        String one = sh.replaceAll("[\\D]","");
        String two = b.replaceAll("[\\D]","");

        Double o = Double.valueOf(one);
        Double t = Double.valueOf(two);


        System.out.println(o+t);
    }
}
