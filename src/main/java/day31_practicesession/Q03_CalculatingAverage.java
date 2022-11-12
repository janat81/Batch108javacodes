package day31_practicesession;

public class Q03_CalculatingAverage {




        //Create a method that calculates 4 students' 6, 4, 3 and 5 exams' average respectively.

        public static void main(String[] args) {
            calculateAverage("Tom Hanks", 55,69,45,90, 100);//Tom Hanks's Average of Exams: 71,80
            calculateAverage("John Travolta", 45, 34, 56, 70);//John Travolta's Average of Exams: 51,25
            calculateAverage("Cüneyt Arkin", 99, 100, 90);//C�neyt Arkin's Average of Exams: 96,33

        }
        public static void calculateAverage(String stdName, double... mark){

            double sum= 0;
            for(double w: mark){
                sum+=w;//this will increase the value of the sum with "w"
            }
            System.out.println(stdName+ "'s Average of Exams: "+ String.format("%.2f", sum/ mark.length));

        }


    }

