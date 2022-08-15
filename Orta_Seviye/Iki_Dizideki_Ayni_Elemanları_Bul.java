package Soru_Bankasi.Orta_Seviye;

import java.util.Arrays;

public class Iki_Dizideki_Ayni_Elemanları_Bul {
    public static void main(String[] args) {

        // İki dizideki ortak elemanları bulup, ortak olan eleman sayısını alacak kadar boş yeni bir dizi oluşturun
        // ve bu ortak elemanları bu boş diziye aktarıp yazdırın.
        // Örneğe göre : [1, 3, 5, 6, 9]


        int dizi1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int dizi2[] = {5, 3, 14, 6, 9, 20, 1};

        int bosDiziElemanSayisi = 0;

        int d1u = dizi1.length;
        int d2u = dizi2.length;

       // *** ORTAK ELEMAN SAYISINI BULMA ***

        for (int i = 0; i < d1u; i++) {
            for (int j = 0; j < d2u; j++) {
                if (dizi1[i] == dizi2[j])
                    bosDiziElemanSayisi++;                     // boş dizinin alabileceği eleman sayısı ortak eleman sayısı kadar olmalıdır.
            }
        }

        int bosDizi[] = new int[bosDiziElemanSayisi];             // boş dizi oluşturuldu. Örneğe göre 5 elemanlı

        // *** ORTAK ELEMANLARI BOŞ DİZİYE AKTARMA ***

       int index=0;

        for (int i = 0; i < d1u; i++) {

            for (int j = 0; j < d2u; j++) {
                if (dizi1[i] == dizi2[j]) {
                    bosDizi[index] = dizi1[i];   // burada bosDizi indexi için i veya j değişkeni kullanıldığında taşma olabilmektedir.
                    index++;                     // bunu önlemek için ortak eleman bulunduğunda değeri 1 artan index değişkeni kullanıldı
                }
            }
        }
        System.out.println(" İki dizideki ortak eleman " + bosDiziElemanSayisi+ " tanedir, bunlar : "+ Arrays.toString(bosDizi));
    }
}






