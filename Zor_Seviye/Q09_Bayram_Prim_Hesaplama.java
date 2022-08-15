package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q09_Bayram_Prim_Hesaplama {
    public static void main(String[] args) {
        // Bir IT firması çalışanlarına Kurban Bayramı öncesi PRİM ve bayram İKRAMİYESİ verecektir.
        // Ünvan olarak; Development (D), Tester (T), Software için (S) girilecektir.
        // Kişinin Taban maaşı, tamsayı olarak girilecektir.
        // Kaç yıldır bu IT firmasında çalıştığı Tamsayı olarak girilecektir.

        // PRİM hesaplanırken ünvana bakılmaksızın, kişinin bu firmada kaç yıl çalıştığı baz alınacaktır,;
        // 5 ve daha az yıldır çalışanlara taban maaşının %10'u PRİM olarak verilecektir
        // 6 ve yukarı yıldır çalışanlara taban maaşının %15'i PRİM olarak verilecektir.
        // İKRAMİYE hesaplanırken kişinin ÜNVANI'na göre hesaplama yapılacaktır.
        // DEVELOPMENT ise; Taban Maaşı ve Prim toplamının % 7'si İKRAMİYE olarak verilecektir.
        // TESTER ise; Taban Maaşı ve Prim toplamının % 6'sı İKRAMİYE olarak verilecektir.
        // SOFTWARE ise; Taban Maaşı ve Prim toplamının % 5'i İKRAMİYE olarak verilecektir.

        // Bu verilere göre; TABAN MAAŞI, ÇALIŞTIĞI YIL ve ÜNVAN'ı girilen kişinin PRİM ve İKRAMİYESİNİ bulunuz...

        Scanner scan = new Scanner(System.in);

        System.out.print(" Kişinin Ünvanını Girin ( D / T / S ) :");
        char unv = scan.next().toUpperCase().charAt(0);

        System.out.print("Taban Maaşı Girin : ");
        int maas = scan.nextInt();

        System.out.print("Çalıştığı Yılı Girin : ");
        int cyil = scan.nextInt();

        double prim, ikr = 0;


        if (cyil <= 5) {

            prim = maas * 0.1;
            if (unv == 'D') {
                ikr = (maas + prim) * 0.07;

            } else if (unv == 'T') {
                ikr = (maas + prim) * 0.06;

            } else {

                ikr = (maas + prim) * 0.05;
            }


        } else {

            prim = maas * 0.15;
            if (unv == 'D') {
                ikr = (maas + prim) * 0.07;

            } else if (unv == 'T') {
                ikr = (maas + prim) * 0.06;

            } else {

                ikr = (maas + prim) * 0.05;
            }

        }

        System.out.println(" Firmanızda " + cyil + " Yıldır "+ unv +" olarak çalışan kişinin");
        System.out.println(" Primi : " + prim + " TL,  Bayram İkramiyesi : " +ikr + " TL'dir");


    }
}
