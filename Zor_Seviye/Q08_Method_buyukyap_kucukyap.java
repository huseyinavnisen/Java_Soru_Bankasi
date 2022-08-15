package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q08_Method_buyukyap_kucukyap {
    public static void main(String[] args) {

        // toUpperCase() yerine buyukyap();
        // toLowerCase() yerine kucukyap() adında iki method yapma ve değer döndürme


        Scanner al = new Scanner(System.in);
        System.out.print("Kelimeyi veya cümleyi Girin: ");
        String kelime = al.nextLine();

        String buyuk = buyukyap(kelime); // girilen kelime buyukyap() adlı methoda gönderilir.
        System.out.println(buyuk);    // method'dan büyütülerek dönen metin yazdırılır.



        String kucuk = kucukyap(kelime);   // girilen kelime kucukyap() adlı methoda gönderilir.
        System.out.println(kucuk);   // method'dan büyütülerek dönen metin yazdırılır.

        buyukyap("alooo");
        kucukyap("HASAN");


    }

    private static String buyukyap(String kelime) {
        String buyukkelime = "";

        for (int i = 0; i < kelime.length(); ++i) {
            char karakterascii = kelime.charAt(i); // karakter karakter ilerleyerek her karakterin ASCII kodunu buluruz.

            if (karakterascii >= 97 && karakterascii <= 122) {  // eğer karakter küçük HARF aralğında ise ASCII değeri 32 azaltılıp Büyük Karaktere çevrilir.
                karakterascii = (char) (karakterascii - 32);
            }
            buyukkelime = buyukkelime + karakterascii; // buyuk kelime değişkenine döngü devam ettikçe BÜYÜK harfi ekler
        }
        return buyukkelime;
    }


    private static String kucukyap(String kelime) {
        String kucukkelime = "";

        for (int i = 0; i < kelime.length(); ++i) {
            char karakterascii = kelime.charAt(i);

            if (karakterascii >= 65 && karakterascii <= 96) {
                karakterascii = (char) (karakterascii + 32);
            }
            kucukkelime = kucukkelime + karakterascii;
        }
        return kucukkelime;
    }

}




