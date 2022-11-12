package day32_practicesession;

public class Q03_CalculationOfAverage {




        //Create a method to calculate 4 students' 3, 4, 6 and 5 exams' average respectively.

        public static void main(String[] args) {
            calculateAverage("Ali", 55, 65, 40, 87);//Ali's Average of Exams: 61,75
            calculateAverage("Tom Hanks", 67, 90, 100, 45, 69, 90);//Tom Hanks's Average of Exams: 76,83
            calculateAverage("John Travolta", 45, 50, 65);//John Travolta's Average of Exams: 53,33

        }

        public static void calculateAverage(String stdName, double...mark){
            double sum= 0;

            for(double w: mark){

                sum+= w;

            }
            System.out.println(stdName + "'s Average of Exams: " + String.format("%.2f", sum/mark.length));

        }
    }

