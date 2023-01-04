package mypractice_1;

public class Question_52 {
    public static void main(String[] args) {
        //Print odd integers from 12 to 67

        for (int i=12;i<68;i++){

            if (i%2!=0){
                System.out.print(i+"   ");
            }
        }

        int k=12;
        while (k<68){
            if (k%2!=0){
                System.out.print(k+"   ");
            }
        }
    }
}
