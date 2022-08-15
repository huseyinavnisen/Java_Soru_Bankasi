package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Ziplayan_Top {
    public static void main(String[] args) {


 /*
    SORU2 : Bir top belirli bir yukseklikten bırakılmaktadır.
    Bırakıldıktan  sonra, bırakıldığı yuksekligin 3/4'ü kadar yerden yukari doğru ziplamaktadir
    Top; ziplama yuksekligi 1 metrenin altina indiginde durmuş kabul edilmektedir.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan kodları do - while ile çözünüz
     */

        Scanner al = new Scanner(System.in);
        System.out.print("Topun İlk Yüksekliğini Gir : ");
        double h = al.nextDouble();
        int sayac = 1;
        double yol = h;

        do {
            h=h*0.75;
            yol=yol+2*h;
            if (h>1) sayac++;
            System.out.print("   Yükseklik :"+h+ "   Aldığı yol : "+yol);
        } while (h>1); // şarta bak

        System.out.println("Toplam aldığı Yol : " + yol);
        System.out.println("Top " + sayac + " kere yere vurmuştur");
    }
}
