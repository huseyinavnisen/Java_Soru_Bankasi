package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;
public class Q07_Cumlede_Aranan_Kelime_Adeti_Bulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cümleyi Girin :");
        String cumle = scan.nextLine();
        System.out.print("Aramak İstediğiniz Karakter veya Kelimeyi Girin :");
        String kelime = scan.nextLine();

        int cumleuzun = cumle.length();
        int kelimeuzun = kelime.length();

        int toplam = 1;  // Boşluk sayısından bir fazla kelime bulsun diye 0 yerine 1 değeri ile başladım.

        for (int i = 0; i <= cumleuzun - kelimeuzun; i++) {
            String kes = cumle.substring(i, i + kelimeuzun);
            // System.out.println(kes);
            if (kes.equals(kelime)) toplam++;  // aranan kelime -har ile aranılan kısım eşit ise toplamı 1 arttır
        }

        System.out.println(kelime + " Cümlede  " + toplam + " Kelimedir");
    }
}
