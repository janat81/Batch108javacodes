package day11practicesession;

public class Palindrome {

    //Type code to check if a given integer is palindrome or not
//Palindrome: 121 <==> 121  123321 <==> 123321 nalan <==>nalan

    public static void main(String[] args) {

        String str1 = "Nalan";

        String reverse = "";

        int idx = str1.length() - 1;

        while (idx >- 1) {
            reverse = reverse + str1.charAt(idx);
            idx--;
        }
        if (str1.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
        String str2="ey edip adanada pide ye"; //22
        String reversedstr2="";

        int idx2=str2.length()-1;
        System.out.println(idx2); //23

        while (idx2>-1){
            reversedstr2=reversedstr2+str2.charAt(idx2);

            idx2--;
        }

        if(str2.equals(reversedstr2)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}

