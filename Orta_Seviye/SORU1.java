package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class SORU1 {

    public static void main(String[] args) {
        // SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
        // o ana kadar kaç sayı girildiği ekrana yazdırılacak.
        // bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.

        Scanner al = new Scanner(System.in);
        int top = 0;
        int sayac = 0;


        // for - loop

        for (int i = 0; top < 100; i++) { // i kontrol edilecek
            System.out.print("Sayı Girin : ");
            int sayi = al.nextInt();
            top += sayi;
            sayac++;

        } // döngü sonu

        System.out.println( + sayac + " adet sayı girdiniz");


        // while -do

        top = 0;
        sayac = 0;
        while (top<100) {
            System.out.print("Sayı Girin : ");
            int sayi2 = al.nextInt();
            top += sayi2;
            sayac++;
        } // while döngü sonu
        System.out.println(+ sayac + " adet sayı girdiniz");

    }



}
