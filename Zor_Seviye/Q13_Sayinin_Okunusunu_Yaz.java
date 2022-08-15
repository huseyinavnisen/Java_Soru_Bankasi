package Soru_Bankasi.Zor_Seviye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13_Sayinin_Okunusunu_Yaz {
    public static void main(String[] args) {


        // Kullanıcı Tarafından Girilen 1-999 arasındaki herhangi bir sayıyı Metin şeklinde Yazan Java Programı
        // Örneğin : 735 girilince ==> " Yediyüz Otuz Beş "  yazacak
        // Örneğin : 61 girilince  ==> " Altmış Bir " yazacak
        // Örneğin : 3 girilince ==> "Üç" yazacak


        List<String> okunusBirler = new ArrayList<>();
        okunusBirler.add("");
        okunusBirler.add("Bir");
        okunusBirler.add("İki");
        okunusBirler.add("Üç");
        okunusBirler.add("Dört");
        okunusBirler.add("Beş");
        okunusBirler.add("Altı");
        okunusBirler.add("Yedi");
        okunusBirler.add("Sekiz");
        okunusBirler.add("Dokuz");

        List<String> okunusOnlar = new ArrayList<>();
        okunusOnlar.add("");
        okunusOnlar.add("On");
        okunusOnlar.add("Yirmi");
        okunusOnlar.add("Otuz");
        okunusOnlar.add("Kırk");
        okunusOnlar.add("Elli");
        okunusOnlar.add("Altmış");
        okunusOnlar.add("Yetmiş");
        okunusOnlar.add("Seksen");
        okunusOnlar.add("Doksan");

        List<String> okunusYuzler = new ArrayList<>();
        okunusYuzler.add("");
        okunusYuzler.add("Yüz");
        okunusYuzler.add("İkiyüz");
        okunusYuzler.add("Üçyüz");
        okunusYuzler.add("Dörtyüz");
        okunusYuzler.add("Beşyüz");
        okunusYuzler.add("Altıyüz");
        okunusYuzler.add("Yediyüz");
        okunusYuzler.add("Sekizyüz");
        okunusYuzler.add("Dokuzyüz");


        Scanner scan = new Scanner(System.in);
        int sayi = 5000; // while döngüsüne girsin diye 1000 den büyük bir ilk değer verildi.
        int basamakSayisi = 0;


        while (sayi > 1000) {
            System.out.print("Maksimum 3 Basamaklı Bir Sayı Girin: ");
            sayi = scan.nextInt();
        }


        List<Integer> basamaklar = new ArrayList<>();

        for (int i = 0; sayi > 0; ) {
            basamaklar.add(sayi % 10); // sayının her basamağı; basamaklar listine sırası ile eklendi.
            sayi = sayi / 10;
            basamakSayisi++;
        }

        if (basamakSayisi == 3) {
            System.out.print(okunusYuzler.get(basamaklar.get(basamakSayisi - 1)) + " ");
            System.out.print(okunusOnlar.get(basamaklar.get(basamakSayisi - 2)) + " ");
            System.out.print(okunusBirler.get(basamaklar.get(basamakSayisi - 3)));
        }
        if (basamakSayisi == 2) {
            System.out.print(okunusOnlar.get(basamaklar.get(basamakSayisi - 1)) + " ");
            System.out.print(okunusBirler.get(basamaklar.get(basamakSayisi - 2)));
        }

        if (basamakSayisi == 1) {
            System.out.print(okunusBirler.get(basamaklar.get(basamakSayisi - 3)));
        }
    }
}