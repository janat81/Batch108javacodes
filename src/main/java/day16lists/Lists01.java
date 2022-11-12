package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        // How to create a List(ArrayList)

        //1.Way:

        ArrayList<Integer> myList1= new ArrayList<Integer>();

        //2.Way:

        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way:

        List<Integer> myList3 = new ArrayList<Integer>();

        //How to print a List on the console
        System.out.println(myList3);

        //How to add elements into a List
        //Note: add() method puts the elements in İnsertion order
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);
        System.out.println(myList3); //[12,7,23]

        //How to add an element into a specific index
        myList3.add(1,50);
        System.out.println(myList3); //[12,50,7,23]

        //How to join two lists


        //How to get the number of elements in a List


        //When you talk about the number of elements in an Array use "length of the Array", for the Lists use "size of the List"

        //Example 1: Type code to check if the given List is empty or not?

        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');

        //1.Way:


        //2.Way: Java created a method to check if a List is empty or not
        //       isEmpty() method returns "true" if the List does not have any element
        //       isEmpty() method returns "false" if the List has at least one element
        boolean isEmpty = c.isEmpty();


        //Note: If Java has a method for specific functionality using the method is preferable

        //Example2: Type code to check if the List does not have any element different from space or the List does not have any element
        //          [] ==> Acceptable        [, ,] ==> Acceptable   [a] ==> Not Acceptable   ...

        





    }

}
