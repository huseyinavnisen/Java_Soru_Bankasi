package Soru_Bankasi.Zor_Seviye;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q22_Sayi_Tahmin_Oyunu_Mustafa_Hoca {
    static  int [] sayiUretAr=new int[4];

    public static void main(String[] args) {
        girisSayfasi();
    }
    static Scanner scan = new Scanner(System.in);
    public static void girisSayfasi() {
        System.out.println("Aciklama icin 1'i, oyun 2'yi giriniz");
        char giris=scan.nextLine().charAt(0);
        switch (giris){
            case '1':
                aciklamaGetir();
                sayiUret();
                sayiKontrol();
                break;
            case '2':
                sayiUret();
                sayiKontrol();
                break;
            default:
                System.out.println("Yanlis deger girdiniz");
                girisSayfasi();
        }
    }
    private static void sayiKontrol() {
        System.out.println("OYUN BASLIYOR");
        int[] girilenSayiArr = new int[4];
        int arti;
        int eksi;
        int toplamBilinen;
        int kacKeredeBuldu = 0;
        int test;
        do {
            arti = 0;
            eksi = 0;
            toplamBilinen = 0;
            test = 0;
            System.out.println("Lutfen 4 basamakli rakamli birbirinden farkli sayi giriniz");
            int girilenSayi = scan.nextInt();  // 1567
            girilenSayiArr[3] = girilenSayi % 10;
            girilenSayiArr[2] = (girilenSayi / 10) % 10;
            girilenSayiArr[1] = (girilenSayi / 100) % 10;
            girilenSayiArr[0] = girilenSayi / 1000;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (girilenSayiArr[i] == girilenSayiArr[j]) {
                        test++;
                    }
                }
            }
            if (girilenSayi < 1000 || girilenSayi > 9999) {
                System.out.println("Girilen " + girilenSayi + " sayisi dort basamakli degildir");
            } else if (test > 4) {
                System.out.println("Girilen " + girilenSayi + " sayisi icinde ayni rakam vardir");
            } else {
                for (int i = 0; i < 4; i++) {  // random sayi  kullanici girdigi sayilar arasinda kac tane ayni rakm var
                    for (int j = 0; j < 4; j++) {
                        if (girilenSayiArr[i] == sayiUretAr[j]) {
                            toplamBilinen++;
                        }
                    }
                }
                for (int j = 0; j < 4; j++) {  // 1578  1698
                    if (girilenSayiArr[j] == sayiUretAr[j]) { // kac tane rakamin dogru oldugunu bulucam
                        arti++;
                    }
                }
                eksi = toplamBilinen - arti;
                kacKeredeBuldu++;
                if (arti == 4) {
                    System.out.println("Sayiniz : " + Arrays.toString(girilenSayiArr));
                    System.out.println("+ " + arti + " Tebrikler, " + kacKeredeBuldu + " . denemede buldunuz.");
                    System.out.println("tutulan sayi : " + Arrays.toString(sayiUretAr));
                } else {
                    System.out.println("+ " + arti + ", - " + eksi);
                }
            }
        } while (arti < 4);
    }
    private static void sayiUret() {
        int test=0;
        int min=1000;
        int max=9999;
        Random rnd=new Random();
        do {
            int sayi = rnd.nextInt(max - min)-min;
            for (int i = 3; i >=0 ; i--) {  // 1561
                sayiUretAr[i]=sayi%10;  // birler masamagi
                sayi/=10;
            }
            for (int i = 0; i <4 ; i++) {
                for (int j = 0; j <4 ; j++) {  // 1561
                    if(sayiUretAr[i]==sayiUretAr[j]){
                        test++;  // 4
                    }
                }
            }
            if (test==4){
                break;
            }else {
                test=0;
            }
        }while (test<4);
        System.out.println(Arrays.toString(sayiUretAr));
    }
    private static void aciklamaGetir() {
        int n;
        FileInputStream fis =null;
        try{
            fis=new FileInputStream("src/aSayiBulmaOyunu/aciklama.txt");
            while ((n=fis.read())!=-1){
                System.out.print((char)n);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya Buunamadi");
        }catch (IOException e){
            System.out.println("Dosyadan bilgiler alinamadi");
        }
        System.out.println();
    }
}


