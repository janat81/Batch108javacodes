package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays03 {

    public static void main(String[] args) {

        //Example 1: Convert multidimensional Array to 1 dimensional Array
        //{{"learn","java","it"},{"is","easy"}} ==> {"learn","java","it","is","easy"}

        String arr[][] = {{"learn","java","it"},{"is"},{"easy"}};

        //1.Step : Find the  total number of elements in the multidimensional Array
        int sum = 0;
        for(String[] w: arr){
            sum=sum+ w.length;
        }
        //2.Step: Create one dimensional array by using the total number of elements in multidimensional array
         String brr[] = new String [sum];
        System.out.println(Arrays.toString(brr));//[null,null,null,null,null]

        //3.Step: Transfer the elements from multidimensional array to one dimensional
        int idx = 0;

        for(String[] w: arr){

            for(String u: w){

                brr[idx] = u;

                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));
    }
}
