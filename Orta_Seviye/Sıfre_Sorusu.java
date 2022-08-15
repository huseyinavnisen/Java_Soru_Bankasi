package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Sıfre_Sorusu {


            /* Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        edin ve sifredeki hatalari yazdirin.
       Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        girdiginde “Sifreniz Kabul edilmistir” yazdirin.

        Sifre kucuk harf icermelidir
        -
        Sifre buyuk harf icermelidir

        Sifre ozel karakter icermelidir

        Sifre en az 8 karakter olmalidir.
       */


    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        String sifre = "";
        int karuz;
        int kard;
        int kucd;
        int buyd;
        int ozkd;
        int dog;

     do {
            kard = 0;
            kucd = 0;
            buyd = 0;
            ozkd = 0;
            dog = 0;

            String ozelKarakterler="!@#$%^&*()_+-=<>?`~/,.|"; // BU SATIRI EKLEDİM

            System.out.print("Şifrenizi Girin : ");
            sifre = al.nextLine();
            karuz = sifre.length();

            for (int i = 0; i < karuz; i++) {

                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') kucd = 1;

                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') buyd = 1;

                if (ozelKarakterler.contains(sifre.substring(i,i+1))) ozkd = 1;

            }

            if (karuz >= 8) kard = 1;

            if (kucd == 0) System.out.println(" Şifrede Küçük Harf olmalı");
            if (buyd == 0) System.out.println(" Şifrede Büyük Harf olmalı");
            if (ozkd == 0) System.out.println(" Şifrede Özel Karakter olmalı");
            if (kard == 0) System.out.println(" Şifre en az 8 karakter olmalı");

            dog = kard + buyd + ozkd + kucd; // 4 şartın hepsi doğru olduğunda hepsinden 1 sayısı gelir. dog = 4 olur.

            if (dog == 4) System.out.println(" Şifreniz Doğru");

        } while (dog != 4);
    }
}


















