package mypractice_1;

public class Question_46 {
    public static void main(String[] args) {


    // Type characters except 'm' in a String

        String city = "Luxembourg";

        for (int i=0; i<city.length(); i++){
            char m = city.charAt(i);
            if (m=='m'){
                continue;
            }else{
                System.out.print(m);
            }
        }

    }
}
