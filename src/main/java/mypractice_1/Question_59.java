package mypractice_1;

public class Question_59 {
    public static void main(String[] args) {

        //Ask user to enter his weight and height. Calculate body index of the user.

        double height = 1.72;
        double squareOfHeight=height*height;
        double weight=90.50;
        double bodyMassIndex=weight/squareOfHeight;
        System.out.println("Your IBM is:"+bodyMassIndex);
        if (bodyMassIndex<18.5){
            System.out.println("You are weak");
        }else if (bodyMassIndex>18.5 && bodyMassIndex<=25) {
            System.out.println("Your weight is ideal");
        }else if (bodyMassIndex>25&&bodyMassIndex<30) {
            System.out.println("You are fat");
        }else if (bodyMassIndex>30){
            System.out.println("Obese");
        }
    }
}
