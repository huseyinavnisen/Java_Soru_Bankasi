package Soru_Bankasi.Zor_Seviye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q23_FilmTahmini {
    /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
 */
    static int filmUzunluk;
    static int filmTahminSayisi;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> filmler = new ArrayList<>(Arrays.asList("BABA", "JOKER", "DEJAVU", "TITANIC"));
        filmTahmin(filmler);
    }


    public static void filmTahmin(List<String> filmler) {
        char harf;
        int secim;

        do {
            System.out.print("Bulmak İstediginiz Film İçin Bir Numara Girin. (1-" + filmler.size() + ") : ");
            secim = scan.nextInt();
        } while (!(secim >= 1 && secim <= filmler.size()));


        filmUzunluk = filmler.get(secim - 1).length();
        System.out.println("Seçtiğiniz Film " + filmUzunluk + " karakterdir");

        filmTahminSayisi = filmler.get(secim - 1).length() * 2;
        System.out.println("Film Tahmini için " + filmTahminSayisi + " hakkınız var");


        List<String> filmAdiList = new ArrayList<>();
        String filmAdi = filmler.get(secim - 1);

        for (int i = 0; i < filmler.get(secim - 1).length(); i++) {
            filmAdiList.add("*");
        }

        System.out.print("Aranan Film : ");
        for (int i = 0; i < filmUzunluk; i++) {
            System.out.print(filmAdiList.get(i) + " ");
        }

        int dtahmin = 0;
        int ytahmin = 0;
        do {
            boolean varMi = false;
            System.out.println("");
            System.out.print("Bir harf giriniz : ");

            harf = scan.next().toUpperCase().charAt(0);

            for (int i = 0; i < filmUzunluk; i++) {
                if (harf == filmAdi.charAt(i)) {
                    filmAdiList.set(i, String.valueOf(harf));  // harf var ise; o harf *' ın yerine set ediir.
                    varMi = true;
                }

            }
            if (varMi) {
                dtahmin++;
            } else ytahmin++;

            filmTahminSayisi--;
            System.out.println("==============================");
            System.out.println("Kalan tahmin hakkiniz : " + filmTahminSayisi);
            System.out.println("Doğru Bulunan Harf Sayısı :" + dtahmin);
            System.out.println("Yanlış Girilen Harf Sayısı :" + ytahmin);
            System.out.println("==============================");


            System.out.print("Aranan Film : ");
            for (int i = 0; i < filmUzunluk; i++) {
                System.out.print(filmAdiList.get(i) + " ");
            }


            int say = 0;
            for (int i = 0; i < filmUzunluk; i++) {  // aranan filmin tüm karakterlerine bakılır
                if (!filmAdiList.get(i).equals("*")) {  // * olmayanlar sayılır
                    say++;   // harf * değil ise say bir artırılır.
                }
            }

            if (say == filmUzunluk) {
                System.out.println("TEBRİKLER BİLDİNİZ");  // eğer say değişkeni film uzunluğa eşit ise
                break;     // demekki hiç bir karakteri * değildir. o zaman tüm karakterler bulunmuş demekktir. döngü kırılır
            }
        } while (filmTahminSayisi != 0);

        if (filmTahminSayisi == 0) {
            System.out.println("");
            System.out.println("===========================");
            System.out.println("Tüm Haklarınızı Bitirdiniz");
            System.out.println("Aranan Film  : " + filmAdi);
        }
    }
}