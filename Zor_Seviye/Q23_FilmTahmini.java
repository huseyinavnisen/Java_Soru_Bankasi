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


        System.out.println("FİLM BULMA OYUNU");
        System.out.println("=================");

        // TÜM FİLMLERİ SIRASI İLE ALT ALTA YILDIZLI OLARAK YAZDIRMA - İSTEĞE BAĞLI
        for (int i = 0; i < filmler.size(); i++) {
            System.out.print("FİLM " + (i + 1) + " : ");
            for (int k = 0; k < filmler.get(i).length(); k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // LİSTEDEN FİLM SEÇTİRME BÖLÜMÜ. LİSTE DIŞINDA FİLM NUMARASI SEÇMESİ ENGELLENDİ
        do {
            System.out.println("===================================");
            System.out.print("Bulacağınız Filmi Seçin (1-" + filmler.size() + ") : ");
            secim = scan.nextInt();
        } while (!(secim >= 1 && secim <= filmler.size()));


        // KULLANICIYA BULACAĞI FİLMİN KARAKTER SAYISINI YAZDIRMA
        filmUzunluk = filmler.get(secim - 1).length();
        System.out.println("Bulacağınız Film " + filmUzunluk + " karakter.");


        // KULLANICIYA VERİLEN TAHMİN HAKKININI YAZDIRMA ( KURAL : Bulacağı filmin karakter sayısının iki katı )
        filmTahminSayisi = filmler.get(secim - 1).length() * 2;
        System.out.println("Bulmak İçin " + filmTahminSayisi + " harf hakkın var.");


    // FİLM ADINI SAKLAYACAĞIMIZ BOŞ BİR LİST OLUŞTURMA VE FİLM KARAKTERİ KADAR YILDIZ ATAMA
        List<String> filmAdiList = new ArrayList<>();
        for (int i = 0; i < filmler.get(secim - 1).length(); i++) {
            filmAdiList.add("*");
        }

        String filmAdi = filmler.get(secim - 1);

        // GİRİLEN HARFLERİ SAKLAMAK VE EKRANDA YAZDIRMAK İÇİN BOŞ BİR LİST OLUŞTURMA
        List<String> girilenHarf = new ArrayList<>();

      // KULLANICIYA YILDIZLI ŞEKLİNDE BULACAĞI FİLM BİLGİSİNİ YAZDIRMA
        System.out.println("===================================");
        System.out.print("Bulunacak Film : ");
        for (int i = 0; i < filmUzunluk; i++) {
            System.out.print(filmAdiList.get(i) + " ");
        }


        int dtahmin = 0;
        int ytahmin = 0;
        int tahminsay = 1;


        // ANA DÖNGÜ BAŞLANGICI
        do {
            boolean varMi = false;
            System.out.println("");
            System.out.print(tahminsay + ".Deneme; harf giriniz : ");
            harf = scan.next().toUpperCase().charAt(0);
            girilenHarf.add(String.valueOf(harf));


            // GİRİLEN HARF DOĞRU İSE YILDIZ YERİNE HARFİ SET ETME
            for (int i = 0; i < filmUzunluk; i++) {
                if (harf == filmAdi.charAt(i)) {
                    filmAdiList.set(i, String.valueOf(harf));  // harf var ise; o harf *' ın yerine set ediir.
                    varMi = true;
                }
            }


            // GİRİLEN DOĞRU VE YANLIŞ HARFLERİN ADETİNİ SAYMA
            if (varMi) {
                dtahmin++;
            } else ytahmin++;


            // TAHMİN SAYISINI BİR AZALTMA
            filmTahminSayisi--;

            // TAHMİN SONRASI KULLANICIYI BİLGİLENDİRME
            System.out.println("==============================");
            System.out.println("Kalan Tahmin Hakkınız : " + filmTahminSayisi);
            System.out.println("Doğru Bulunan Harf Sayısı :" + dtahmin);
            System.out.println("Yanlış Girilen Harf Sayısı :" + ytahmin);
            System.out.println("==============================");


            // FİLM ADINI YILDIZLI VE BULUNAN HARFLER İLE BİRLİKTE YAZDIRMA  ( D * J A V * )
            System.out.print("Bulunacak  Film : ");
            for (int i = 0; i < filmUzunluk; i++) {
                System.out.print(filmAdiList.get(i) + " ");
            }


            // O ANA KADAR GİRİLEN HARFLERİ EKRANA YAZDIRMA BAŞLANGIÇI
            System.out.println();
            System.out.println("Girdiğin Harfler : " + girilenHarf); // [ D,L,J,Ü,A,B,V]


            // FİLM ADINDA HALA YILDIZ VARMI ? KISMI ==>  HİÇ YILDIZ YOKSA FİLMİ BULMUŞUZDUR
            int say = 0;
            for (int i = 0; i < filmUzunluk; i++) {  // aranan filmin tüm karakterlerine bakılır
                if (!filmAdiList.get(i).equals("*")) {  // * olmayanlar sayılır
                    say++;   // aranan harf "*" değil ise say bir artırılır.
                }
            }

            // FİLM ADINI BİLİP BİLEMEDİĞİMİZİN KONTROLÜ
            if (say == filmUzunluk) {
                System.out.println();
                System.out.println("TEBRİKLER BİLDİNİZ");  // eğer say değişkeni film uzunluğa eşit ise
                bildi = true;
                break;     // demekki hiç bir karakter "*" değildir. o zaman tüm karakterler bulunmuş demektir. döngü kırılır
            }


            tahminsay++;
        } while (filmTahminSayisi != 0); // WHILE DONGÜ SONU


        if (filmTahminSayisi == 0 && (bildi = false)) { // en son tahminde filmi bulduğunda; filmtahminsayisi=0 olduğu halde; bildi=true olacağı için bu şartı geçmesi lazım
            System.out.println("");
            System.out.println("===========================");
            System.out.println("Tüm Haklarınızı Bitirdiniz");
            System.out.println("Aranan Film  : " + filmAdi);
        }
    }
}