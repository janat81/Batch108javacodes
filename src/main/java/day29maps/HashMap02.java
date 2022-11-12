package day29maps;

import java.util.HashMap;

public class HashMap02 {

    /*
      1)When you create a HashMap, Java creates 16 "buckets" in memory and index them from 0 to 15
      2) When you use put method, Java creates an Integer HashCode and calculates HashCode%16
      3) The result of Hashcode%16 will be the index to select bucket
      4)After selecting buckets Java will put the entry into the selcted bucket as a node of a Linked List
      5) Every node will have four parts in it i)Hashcode ii)Key
      6) Java makes every HashCode unique but sometimes Java can create same Hashcodes accidentally this is called "Hashcode Collision"
      7) "HasCode Collision"s are common phenomena of hashing functions
      8) If the key is null HashCode will be zero that's why the entry whose key is null will be put into the bucket whose index is zero
     */

    public static void main(String[] args) {

        HashMap<String,Double> coursePrices = new HashMap<>();

        coursePrices.put("Full Stack Java Development", 6000.00);//33%16=1

        coursePrices.put("Full Stack Automation Engineer",5000.00);//65%16=1

        coursePrices.put("Salesforce Development",4500.00);//21%16=5

    }

}
