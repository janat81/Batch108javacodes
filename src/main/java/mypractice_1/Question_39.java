package mypractice_1;

public class Question_39 {
    public static void main(String[] args) {
        // Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11

        for (int i = 120; i>11; i--){
            if (i%4==0&&i%6!=0){
                System.out.print(i+ "  ");
            }
        }
    }
}
