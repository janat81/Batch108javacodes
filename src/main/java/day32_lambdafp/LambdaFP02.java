package day32_lambdafp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {
    /*
        1) "variable or variables"==> "logic" ==> this structure is called "Lambda Expression"

        2) In Functional Programming,  we can use "Lambda Expression", it is allowed but not recommended.
        Instead of "Lambda Expression", we prefer "method reference".
        3) Method Reference is "Class Name::Method Name".
        For ex;     "String :: length" (Do not type method parenthesis, type just method name)
                    "Arrays :: toString"
                    "UtilityClass::getCube"
        You can use your own class to create the required methods for your application. For ex; you created "Animal" class and you have eat()
        in Animal class ==> "Animal::eat"
     */


    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementsFunctional(l);
        System.out.println();


    }

    //1)Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.
    public static void printElementsFunctional(List<Integer> list) {

    }
}