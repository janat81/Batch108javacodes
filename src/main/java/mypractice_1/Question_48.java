package mypractice_1;

public class Question_48 {
    public static void main(String[] args) {

        String num= "234455";
        int sum =0;
        for (int i=0; i<num.length();i++){
            String digit = num.substring(i,i+1);
            if (num.indexOf(digit)==num.lastIndexOf(digit)){
                sum =sum +Integer.valueOf(digit);
            }
        }
        System.out.println(sum);
    }
}
