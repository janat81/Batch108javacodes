package mypractice;

public class Question14 {

    public static void main(String[] args) {

        int y = 2200;

        String year = y%100==0?(y%400==0?"leap":"not leap"):(y%4==0?"leap":"not leap");
        System.out.println("year is "+ year);

    }
}
