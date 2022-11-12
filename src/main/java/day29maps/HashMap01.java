package day29maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

     /*
            1) Maps have key - value structure
            2) Key's are unique but value's are not
            3) Every element in a Map is called as "Entry"
            4)All elements are called as"EntrySet"
            5)Key cannot be null in Maps except "HasMap" but value can

            6) HashMaps put the entries in random order, because of that it is super-fast
         */

    public static void main(String[] args) {


         // How to create a HashMap
        HashMap<String,Integer> stdAges = new HashMap<>();

        // How to put entries into a HashMap
        stdAges.put("Ali Can",13);
        stdAges.put("Tom Hanks",46);
        stdAges.put("Brad Pit",55);
        stdAges.put("Angelina Julie",48);

        System.out.println(stdAges); //{Tom Hanks=46, Brad Pit=55, Angelina Julie=48, Ali Can=13}

        //How to get just keys from a Map
        Set<String> keys = stdAges.keySet();
        System.out.println(keys);//[Tom Hanks, Brad Pit, Angelina Julie, Ali Can]

        // How to get just values from a Map
        Collection<Integer> ages = stdAges.values();
        System.out.println(ages); //[46, 55, 48, 13]

        // Can I put null into key?
        // Yes you can put "null" just in HasMap key
        stdAges.put(null,23);
        System.out.println(stdAges);

        // Can I put null into value?
        stdAges.put("Ajda Pekkan",null);
        stdAges.put("Someone Uknown",null);
        System.out.println(stdAges);

        //What happens if you use same key repeatedly?
        // Java accepts the final value for the key (overwriting)
        stdAges.put("Angelina Julie",23);

        // How to get a value of a key?
        Integer tomAge = stdAges.get("Tom Hanks");// 46
        System.out.println(tomAge);

        //If the key does not exist when you use get() method?
        // It returns null for non-existing keys
        Integer unknownAge = stdAges.get("Abs Xyz");// 46
        System.out.println(tomAge); //null


        //getOrDefault("Abc Xyz",0)

        Integer unknownAge2 = stdAges.getOrDefault("Abs Xyz",0);
        System.out.println(unknownAge2); //0

        //I want to put an entry if it does not exist, if the entry exists I will not put it.
        stdAges.putIfAbsent("Brad Pit",44);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pit=55, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13, Someone Uknown=null}

        stdAges.putIfAbsent("Cuneyt Arkin",44);
        System.out.println(stdAges);//{null=23, Tom Hanks=46, Brad Pit=55, Cuneyt Arkin=44, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13, Someone Uknown=null}

        //How to update the value of a key
        stdAges.replace("Tom Hanks",56);
        System.out.println(stdAges);//{null=23, Tom Hanks=56, Brad Pit=55, Cuneyt Arkin=44, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13, Someone Uknown=null}


        //How to update the value of a key after checking key and the existing value
        stdAges.replace("Tom Hanks",56,66);
        System.out.println(stdAges); //{null=23, Tom Hanks=66, Brad Pit=55, Cuneyt Arkin=44, Angelina Julie=23, Ajda Pekkan=null, Ali Can=13, Someone Uknown=null}

        //How to remove an entry from a Map
        stdAges.remove("Someone Uknown");
        System.out.println(stdAges);

        stdAges.remove("Ajda Pekkan",null);
        System.out.println(stdAges);//{null=23, Tom Hanks=66, Brad Pit=55, Cuneyt Arkin=44, Angelina Julie=23, Ali Can=13}

        //How to get entries one by one from a Map
        Set< Map.Entry<String,Integer>>entries = stdAges.entrySet();

        for(Map.Entry<String,Integer>w:entries){
            System.out.println(w+"!");
        }
    }

}
