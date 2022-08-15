package Soru_Bankasi.Orta_Seviye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21_Sifiri_En_Sona_At_Dizi {
    public static void main(String[] args) {
       /*
        Put all zeros to end in an integer array
        {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
        {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
        */
        int arr[] = {3, 0, 4, 2, 0};
        System.out.println("Array'in Başlangıç Durumu :" + Arrays.toString(arr));
        int sifirAdet = 0;
        List<Integer> list = new ArrayList<>(); // boş bir list oluşturuldu.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);  // arraydaki eleman"0" dan farklı ise;  liste eklendi
            } else sifirAdet++; // arraydeki eleman "0" ise; değişken 1 artırıldı
        }
        for (int i = 1; i <= sifirAdet; i++) list.add(0); // listin sonuna, arraydeki "0" adeti kadar "0" eklendi.

        System.out.println("List'in Son Durumu     :" + list);
        // Bu aşamada istenenler gerçekleştirilmiş olup List değişkeninde saklanmaktadır.

        // İSTEĞE BAĞLI EK KODLAR
        // İstersek bu listi boş bir array oluşturup döngü ile boş arraya bire-bir aktarabiliriz
        int bosArr[] = new int[arr.length]; // ilk array ile aynı uzunlukta dizi boş bir array oluşturldu
        for (int i = 0; i <arr.length ; i++) {
            bosArr[i]=list.get(i); // listin elemanları bire-bir boş arraya eklendi
        }
        System.out.println("Array'in Son Durumu       :" + Arrays.toString(bosArr));

    }

}
