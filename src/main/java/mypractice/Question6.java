package mypractice;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter width,length,heigth");

        double w = input.nextDouble();
        double l = input.nextDouble();
        double h= input.nextDouble();

        System.out.println("total area is "+ (2*w*l+ 2*l*h + 2*w*h));

    }
}
