package day11practicesession;

public class Stringmanipulation {

    public static void main(String[] args) {

        //Example1:
        /*
        Type code to reverse a string.
           Tom Hanks==> sknaH moT
         */
         /*Type code to reverse a string.
     Tom Hanks==> sknaH moT*/

        String name= "Tommy";

        String reversedName= "";

        for (int i=name.length()-1; i>=0; i--){

            reversedName=reversedName+name.charAt(i);
        }
        System.out.println(reversedName);

        //Example2:
        //Get the initial from full name. (Middle name is out of scape).
        //Tom Hanks ==> TH

        String fullName = "   Tom Hanks  ";

        String initialOfFirstName= fullName.trim().substring(0,1).toUpperCase();
        System.out.println("The initial is: " + initialOfFirstName); //T

       //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in
       //the middle.
        // substring(startingIndex, endIndex) method is used to get a specific part of a string.
       //starting index is inclusive, ending index is exclusive.

        String initialOfLastName= fullName.trim().split("")[1].substring(0,1).toUpperCase();

        System.out.println("InitialOfLastName: " + initialOfLastName);
        System.out.println(initialOfFirstName+initialOfLastName);





    }

}
