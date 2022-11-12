package day29maps;

import java.util.Hashtable;

        /*
                1)Hashtable is a Map
                2)Hashtable does not put entries to any order
                3)Hashtable is slower than HashMap
                4)Hashtable is thread-safe and synchronized
         */

public class HashTable01 {

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 85000000);
        countryPopulations.put("Turkey", 81000000);

        System.out.println(countryPopulations);

    }
}