package mypractice;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Create a simple calculator which does addition,
        // subtraction, multiplication, division, percentage calculation.

        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        double firstNum = input.nextDouble();

        System.out.println("enter second number");
        double secondNum = input.nextDouble();

        System.out.println("enter operation sign");
        char operation = input.next().charAt(0);



        switch(operation){
            case '*':
                System.out.println(firstNum*secondNum);
                break;
            case '/':
                System.out.println(firstNum/secondNum);
                break;
            case '+':
                System.out.println(firstNum+secondNum);
                break;
            case '-':
                System.out.println(firstNum-secondNum);
                break;
            case '%':
                System.out.println(firstNum%secondNum);
                break;
            default:
                System.out.println("not expected operation");
        }

    }
}
