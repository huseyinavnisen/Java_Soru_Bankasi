package Soru_Bankasi.Orta_Seviye;

import java.util.Arrays;

public class Array_Dizideki_Elemanları_Sirala_Sort_Kullanma {

    public static void main(String[] args) {

        // Verilen bir dizi içindeki sayıları büyükten küçüğe sıralayarak aynı dizi içine tekrar yerleştirin.

        int dizi[] = {150,0,61,-36,4};  // Örneğe Göre ==> 61
        int bosdizi[] = new int[dizi.length]; // dizi değişkeni ile aynı türde boş dizi oluşturuldu.

        int enbs = 0;
        int enks = 0;
        int indexMax = 0;

        System.out.println(" Dizinin İlk Hali : " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {    // Dizideki en büyük sayi bulunur. ==> 61
            if (dizi[i] > enbs) {
                enbs = dizi[i];
                indexMax = i;                      // En büyük sayının indexi bulunur. ==> 2
            }
        }

        for (int i = 0; i < dizi.length; i++) {    // Dizideki en küçük sayi bulunur.  ==> -36
            if (dizi[i] < enks) {
                enks = dizi[i];
            }
        }

        bosdizi[0] = enbs;                        // en büyük sayı boş dizinin ilk endeksine atanır.
        bosdizi[dizi.length - 1] = enks;         // en küçük sayı boş dizinin son indeksine atanır.


        dizi[indexMax] = enks;                 // İlk dizide bulunan en büyük sayıya en küçük sayı atanırki artık bu sayı dikkate alınmasın.
                                               // Çünkü bundan sonra döngü içinde sıra ile hep büyük sayılar bulunup boş diziye aktarılacaktır.
                                               // ilk dizi içinde büyük sayı bulunduğunda bu atama işlemi tekrar ettirilecektir.



        for (int i = 1; i < dizi.length-1 ; i++) {       // ilk ve son indexe daha önce max ve min sayılar atandığı için döngü  böyle kuruldu.
            enbs = enks;                                // ana döngü her başladığında enbs değişkeni en küçük sayı olacak şekilde resetleniyorki
                                                        // if sorgusunda dizi içinde ondan büyük sayıyı bulabilsin

            for (int j = 0; j < dizi.length; j++) {     // İlk dizi içinden kalan sayılardan en büyük olanı bulunuyor enbs değişkenine atanıyor
                if (dizi[j] > enbs) {                   //  Bulunan büyük sayının indexi bulunuyor
                    enbs = dizi[j];
                   indexMax = j;
                }
            }
            bosdizi[i] = enbs;                  // ilk dizide kalan sayılardan enbüyük sayı bulunup boş dizideki yerine atanıyor.
            dizi[indexMax] = enks;              // ilk dizideki kalan sayılardan en büyük olanına  enküçük değeri atanıyor.
        }

        for (int i = 0; i < bosdizi.length ; i++) {   // sıra ile büyükten küçüğe tüm sayılar aktarılan boş dizi
            dizi[i]=bosdizi[i];                       // ilk diziye geri aktarılıyor.
        }

        System.out.println(" Dizinin Son Hali : " + Arrays.toString(dizi));
    }
}









