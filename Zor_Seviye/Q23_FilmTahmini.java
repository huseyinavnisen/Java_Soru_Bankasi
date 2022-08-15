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
        List<String> filmler = new ArrayList<>(Arrays.asList("TITANIC", "BABA", "DEJAVU", "JOKER"));
        filmTahmin(filmler);
    }


    public static void filmTahmin(List<String> filmler) {
        char harf;
        int secim;
        boolean bildi = false;
        do {
            for (int i = 0; i < filmler.size(); i++) {
                System.out.print("FİLM " + (i + 1) + " : ");
                for (int k = 0; k < filmler.get(i).length(); k++) {
                    System.out.print("* ");
                    ;
                }
                System.out.println("");
            }


            System.out.println("===================================");
            System.out.print("Bulacağınız Filmi Seçin (1-" + filmler.size() + ") : ");
            secim = scan.nextInt();
        } while (!(secim >= 1 && secim <= filmler.size()));


        filmUzunluk = filmler.get(secim - 1).length();
        System.out.println("Bulacağınız Film " + filmUzunluk + " karakter.");

        filmTahminSayisi = filmler.get(secim - 1).length() * 2;
        System.out.println("Bulmak İçin " + filmTahminSayisi + " harf hakkın var.");


        List<String> filmAdiList = new ArrayList<>();
        String filmAdi = filmler.get(secim - 1);

        for (int i = 0; i < filmler.get(secim - 1).length(); i++) {
            filmAdiList.add("*");
        }
        System.out.println("===================================");
        System.out.print("Bulunacak Film : ");
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
            System.out.println("Kalan Tahmin Hakkınız : " + filmTahminSayisi);
            System.out.println("Doğru Bulunan Harf Sayısı :" + dtahmin);
            System.out.println("Yanlış Girilen Harf Sayısı :" + ytahmin);
            System.out.println("==============================");


            System.out.print("Bulunacak  Film : ");
            for (int i = 0; i < filmUzunluk; i++) {
                System.out.print(filmAdiList.get(i) + " ");
            }


            int say = 0;
            for (int i = 0; i < filmUzunluk; i++) {  // aranan filmin tüm karakterlerine bakılır
                if (!filmAdiList.get(i).equals("*")) {  // * olmayanlar sayılır
                    say++;   // aranan harf "*" değil ise say bir artırılır.
                }
            }

            if (say == filmUzunluk) {
                System.out.println();
                System.out.println("TEBRİKLER BİLDİNİZ");  // eğer say değişkeni film uzunluğa eşit ise
                bildi = true;
                break;     // demekki hiç bir karakter "*" değildir. o zaman tüm karakterler bulunmuş demektir. döngü kırılır
            }
        } while (filmTahminSayisi != 0);

        if (filmTahminSayisi == 0 && (bildi = false)) {
            System.out.println("");
            System.out.println("===========================");
            System.out.println("Tüm Haklarınızı Bitirdiniz");
            System.out.println("Aranan Film  : " + filmAdi);
        }
    }
}