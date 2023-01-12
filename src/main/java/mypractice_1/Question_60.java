package mypractice_1;

import jdk.swing.interop.SwingInterOpUtils;

public class Question_60 {
    public static void main(String[] args) {

          //Remove all punctuations in a String

        String life="Live and Learn. Love. Be happy. Prioritize your peace.";

       String noPunct= life.replaceAll("\\p{Punct}","");
        System.out.println(noPunct);

         //Remove all except punctuations in a String

       String noPunct2= life.replaceAll("\\P{Punct}","");
        System.out.println(noPunct2);
    }
}
