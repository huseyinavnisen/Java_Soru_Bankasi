package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q10_Mukemmel_Sayi {

    /*
            Problem Tanımı :
            Kullanıcıdan alınan  bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
            Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
            ORNEK:
            INPUT     : 6
            OUTPUT : 1,2,3
                          1+2+3 = 6 = 6 (Mükemmel)
            */

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        System.out.print(" Sayıyı Girin : ");
        int sayi = al.nextInt();
        String bol = "";


        int boltop = 0;

        if (sayi == 0) {  // sayının herhangi birinin 0 olması durumunu sorgulattım.
            System.out.println(" Sıfırdan büyük bir sayı giriniz");

        } else {
            for (int i = 1; i <sayi; i++) {
                if (sayi % i == 0) {
                    bol += i + " ";
                    boltop += i;

                }
            }
        }

        if (boltop == sayi) System.out.println(sayi+ " Sayısı Mükemmel Sayıdır. Sayının Bölenleri :" + bol );


    }

}














