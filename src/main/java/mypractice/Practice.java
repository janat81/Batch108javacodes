package mypractice;
import java.util.LinkedList;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {

        //float num1 =3.23F;

        //double num2 = num1;
       // System.out.println(num2);

       // short num1 = 255;
        //byte num2 =(byte) num1;
        //System.out.println(num2);

        //double num5 = 456789;
        //int num6 = (int) num5;
        //System.out.println(num6);

        int num1=5/3;
        System.out.println(num1);

        float num2=5f/3f;
        System.out.println(num2);

        double num3=5d/3d;
        System.out.println(num3);

        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");

        String name1 = name.next();
        name1 = "Janat";

        System.out.println(name1);

        //Example1: Change all names that start with "A" to "*****"
        LinkedList<String>visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Ali");
        visitors.add("Ahmet");

        for(String w: visitors) {

            if (w.startsWith("A")) {

                visitors.set(visitors.indexOf(w),"*****");
                System.out.println(visitors);
            }
        }
        System.out.println(visitors);
           //If the number of characters is more than 4, remove them from the link list


    }

}
