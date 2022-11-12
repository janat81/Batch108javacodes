package day32_lambdafp;



public class UtilsClass {

    public static void printInTheSameLineWithASpace(Object str){

        System.out.print(str + " ");

    }
    public static boolean checkToBeEven(int x){

        return x%2==0;
    }

    public static boolean checkToBeOdd(int x){

        return x%2!=0;
    }
    public static int getSquare(int x){
        return x*x;
    }
    public static int getCube(int x){
        return x*x*x;
    }

    public static double getHalf(int x){
        return x/2.0;
    }

}