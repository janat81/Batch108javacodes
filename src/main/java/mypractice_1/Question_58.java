package mypractice_1;
public class Question_58 {
    public static void main(String[] args) {
//Print digits just in the decimal part with an asterix.

        double num = 75.4238;
        String str = String.valueOf(num);
        String s="";
        int i=0;
        String decPart=str.split("\\.")[1];
        do {
            String r= decPart.substring(i,i+1);
            s=s+"*"+r;
            i++;
        }while (i<decPart.length());

        System.out.println(s);



    }
}
