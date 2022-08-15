package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q11_Okek_Obeb_Method {

    /*
    Girilen iki sayının OKEK'ini ve OBEB'ini bulan ve geri dönderen
    okek() ve obeb() methodları
     */

    public static void main(String[] args) {

        Scanner al = new Scanner(System.in);
        System.out.print(" 1.Sayı : ");
        int s1 = al.nextInt();
        System.out.print(" 2.Sayı : ");
        int s2 = al.nextInt();

        System.out.println("OKEK :" + okek(s1, s2));
        System.out.println("OBEB :" + obeb(s1, s2));
    }


    public static int obeb(int s1, int s2) {


        int okek = 0;

        if (s1 == 0 || s2 == 0) {  // sayılardan herhangi birinin 0 olması durumunu sorgulattım.
            System.out.println(" Sıfır sayısının OKEK'i olmaz");

        } else {
            for (int i = 1; i >= 1; i++) {
                if (i % s1 == 0 && i % s2 == 0) { // döngüde devamlı değeri artan i değerini; hem s1'e hemde s2'ye böldüğümüzde aynı anda kalanı 0 ise, o i değeri OKEK olur.
                    okek = i;  // bulduğum OKEK değerini okek değişkenine atadım.
                    i = -1;  // döngüyü kırmak için i'ye -1 değerini atadım.
                }
            }
        }
        int obeb = (s1 * s2) / okek;

        return obeb; // bulduğum OBEB değerini geri gönderdim.
    }


    public static int okek(int s1, int s2) {
        int okek = 0;

        if (s1 == 0 || s2 == 0) {  // sayılardan herhangi birinin 0 olması durumunu sorgulattım.
            System.out.println(" Sıfır sayısının OKEK'i olmaz");

        } else {
            for (int i = 1; i >= 1; i++) {
                if (i % s1 == 0 && i % s2 == 0) { // döngüde devamlı değeri artan i değerini; hem s1'e hemde s2'ye böldüğümüzde aynı anda kalanı 0 ise, o i değeri OKEK olur.
                    okek = i;  // bulduğum OKEK değerini okek değişkenine atadım.
                    i = -1;  // döngüyü kırmak için i'ye -1 değerini atadım.
                }
            }
        }
        return okek;  // bulduğum OKEK değerini geri gönderdim.
    }
}














