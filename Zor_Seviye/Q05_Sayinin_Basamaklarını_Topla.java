package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q05_Sayinin_Basamaklarını_Topla {
    public static void main(String[] args) {


        // Kullanıcı Tarafından Girilen Sayının Basamakları Toplamını Bulan Java Programı
        // Sayı kaç basamaklı girilir ise girilsin sonucu bulmaktadır.

        Scanner scan = new Scanner(System.in);

        System.out.print("Sıfırdan Büyük Bir Sayı Girin: ");
        int sayi = scan.nextInt();
        int ilks = sayi;
        int bdt = 0, bd = 0;

        if (sayi <= 0) {
            System.out.println(" HATA ==> Sıfırdan Büyük Bir Sayı Girin");
        } else {

            for (; sayi > 0; ) { // döngü sayi değişkeni 0'dan büyük olduğu sürece devam eder,
                bd = (sayi % 10);  // sayıyının 10'a bölümünden kalanı bize o sayının son basamağı verir.
                bdt += bd;   // son basamaktaki basmak değerini top değişkenine ekleriz.
                sayi = sayi / 10; // sayiyi 10'a bölerek bir eksik basamaklı halini elde ederiz.
            }
            System.out.print(ilks + " Sayısının Basamaklarının Toplamı  : " + bdt);
        }

    }

}