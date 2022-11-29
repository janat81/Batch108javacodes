package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class LmsQuestion {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=  new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);
        numbers.add(2);
        System.out.println("Tum Sayılar   = " + numbers);



        //1.way
        int silinecekSayi6=6;
        numbers.removeIf(e -> (e == silinecekSayi6));;
        System.out.println("6'lar Silindi = " + numbers);

        //2.way
        int silinecekSayi4=4;
        numbers.removeAll(Arrays.asList(silinecekSayi4));
        System.out.println("4'ler Silindi = " + numbers);

        //3.way : Tam doğru çalışmaz, sadece ilk 3'ü siler
        int silinecekSayi3=3;
        numbers.remove((Integer) silinecekSayi3);
        System.out.println("3'ler Silindi = " + numbers + " - Not:3'lerin sadece ilki Silindi");

        //4.way
        //  A. Aşağıdaki şekilde çalışmaz.
        //      Çünkü aktif listeden bir item remove edildiğinde listenin yapısı bozulduğu için hata verir.
            /*for(Integer sayi:numbers) {
                if(sayi==silinecekSayi3)
                    numbers.remove(sayi);
            }*/

        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)==silinecekSayi3)
                numbers.remove(i);
        }
        System.out.println("3'ler Silindi = " + numbers + " - Not:3'lerin hepsi Silindi ");

        //4.way
        int silinecekSayi2=2;
        boolean donguDurum=true;
        while (donguDurum) {
            int index=numbers.indexOf(silinecekSayi2);  //Bulunan 2 nin numbers taki index ini veriri
            if(index==-1){  //Eğer index=-1 ise sayıyı ulamadı demektir.
                donguDurum=false;  //Sayı bulunamadı ise döngü sonlansın
            }
            else {
                numbers.remove(index);
            }
        }
        System.out.println("2'ler Silindi = " + numbers);

        //5.way
        int silinecekSayi1=1;
        while (numbers.contains(silinecekSayi1)) {
            numbers.remove(Integer.valueOf(silinecekSayi1));
            //Dikkat burada
            //numbers.remove(silinecekSayi1);
            //sşekilinde kullanırsanız IndexOutOfBoundsException hatası verir,
            //Çünkü remove() metodunun 2 overloadı var
            //remove(değer) ve remove(index)
            //numbers.remove(silinecekSayi1) şeklinde kullanırsanız silinecekSayi1'i index olarak algılar ve hata verir. (Listeki elamanlara göre vermeyebilirde)
            //ama umbers.remove(Integer.valueOf(silinecekSayi1)) şeklinde kullanırsanız listeden değer siler ve hata vermez
        }
        System.out.println("1'ler Silindi = " + numbers);

        //6.way
        //Listenin indexi remove yapılınca bozulduğu için,
        // bunu önlemek adına döngü değerini sadece remove yapmadığımız zamanlarda artıtrıyoruz.
        int silinecekSayi5=5;
        for (int i = 0; i < numbers.size();) {
            System.out.println("i="+i + " - numbers.size()="+ numbers.size());
            if (Objects.equals(silinecekSayi5, numbers.get(i))) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("5'ler Silindi = " + numbers);

    }
}
