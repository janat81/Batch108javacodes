package day13_arrays;

import java.util.Arrays;

public class Arrays_02 {

    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines

        String cities [] = new String [5];

        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "JacksonVille";
        cities[4] = "Calgary";
        System.out.println(Arrays.toString(cities));

        //How to put elements in natural order. Natural order for string ==> alphabetical order
        //                                        Natural order for numeric values ==> ascending order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        for(String w: cities) {

            System.out.println(w);

        }

      //Example 2 : Create a String Array and print the elements whose length is less than 5
        // shorter way to create an Array

        String names [] = { "Ali","Thomas", "Mark", "Jackson", "Tom", "Martin"};
        System.out.println(Arrays.toString(names));
        for (String w: names) {

            if(w.length()<5){

                System.out.println(w);

            }
        }

        //Example3: Create a String Array and print the elements before "Tom".

        String student [] = {"Ali", "Aisha", "Janet", "Tom", "John"};

        for (String w : student){

            if(w.equals ("Tom")) {
                break;
            }
                System.out.println(w);
            }



        // //Example 4: Create a String Array and print the elements before "Tom" and "Tom"

        String student2 [] = {"Ali", "Aisha", "Janet", "Tom", "John"};

        for (String w : student2) {



        System.out.println(w);

        if (w.equals("Tom")) {
            break;
        }

        }

        //Example 5: Create a String Array and print the elements different from "Tom"

        String employee[] = {"Ali", "Aisha", "Janet", "Tom", "John", "Michael", "Susan"};

        for (String w : employee){
            if (w.equals("Tom")){
                continue;  //skip

            }
            System.out.println(w);
        }
        }



    }

