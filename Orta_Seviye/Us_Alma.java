package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Us_Alma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabanı Girin :");
        int tb = scan.nextInt();
        System.out.print("Üssü Girin :");
        int us = scan.nextInt();


        long sonuc = 1;

        if (us < 0) {
            System.out.println("Negatif üs olmaz");
        } else if (us == 0) {
            System.out.println("Sonuç = 1");

        } else {
            for (int i=1; i<=us; ++i) {
                sonuc *= tb;
            }
            System.out.println("Sonuç = " + sonuc);
        }

    }
}
