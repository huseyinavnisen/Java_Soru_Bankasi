package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class SORU3_5000_e_Kadar_9_ve_11_in_Katı {

    /*
     Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
     */

    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        int dizi[] = new int[8];
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizi[" + i + "] = ");
            dizi[i] = al.nextInt();
            if (dizi[i] % 3 == 0) sayac++;
            System.out.println("");
        }
        System.out.print("Dizide 3'e tam bölünebilen elaman sayısı : " + sayac);
    }
}
