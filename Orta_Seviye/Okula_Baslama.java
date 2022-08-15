package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Okula_Baslama {
    public static void main(String[] args) {

        // Problem :  Eylül - 2022 tarihine göre;
        // Okula Kayıt Yaptırmak İsteyen Öğrencinin KAÇ AYLIK olduğunu bularak
        // Okula kayıt yaptırıp - Yaptıramayacağının incelenmesi

        // Öğrecinin Doğduğu Yıl ve Doğduğu ay ayrı ayrı SAYI olarak giriliyor.
        // Öğrencinin yaş olarak kaç Aylık olduğunu ekrana yazdırıyoruz. ( " Öğrenci 75 Aylık"  gibi )
        // Eğer Öğrenci 70 aydan küçükse ==> " Kayıt Yaptıramaz "
        // Eğer Öğrenci 71 - 80(dahil) ay arasında ise  ==> " Veli İsteğine Bağlı Olarak Kayıt Yaptırabilir  "
        // Eğer Öğrenci 81 aydan büyükse ==> "Kayıt Yaptırmalıdır "

        Scanner scan=new Scanner(System.in);

        System.out.print("Öğrencinin Doğduğu Yılı Girin  (Örn:2013 ) :");
        int dyil=scan.nextInt();

        System.out.print("Öğrencinin Doğduğu Ayı Girin   ( Örn : 6 ) :");
        int day=scan.nextInt();

        int ay=(2022 - dyil)*12 + (9 -day);

        System.out.println("Öğrenci " + ay + " aylık ");

        if (ay<70) {
            System.out.println("Kayıt Yaptıramaz ");
        }
        else if (ay<=80) {
            System.out.println("Veli İsteğine Bağlı Olarak Kayıt Yaptırabilir ");
        }
        else {
            System.out.println("Kayıt Yaptırmalıdır ");
        }

    }
}
