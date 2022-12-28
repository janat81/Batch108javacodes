package mypractice_1;

public class Question_43 {
    public static void main(String[] args) {

        StringBuilder rev = new StringBuilder("Tom");
         rev.reverse();
        System.out.println(rev);

        // Find the sum of the integers from 3 to 6
        int sum= 0;
        for (int i =3; i<7; i++){

            sum = sum + i;

        }
        System.out.println(sum);
    }
}
