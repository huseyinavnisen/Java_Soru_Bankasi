package Soru_Bankasi.Zor_Seviye;

import java.util.Random;
import java.util.Scanner;

public class Q12_Sayi_Tahmin_Oyunu {
    public static void main(String[] args) {

        // Java'nın 0-100 arasında tuttuğu sayıyı en az tahmin ile bulmaya çalışmak. ( maksimum 10 hakkınız var )

        Scanner al = new Scanner(System.in);
        Random random = new Random();

        int sayi = random.nextInt(100) + 1; // 0 -100 arası rastgele sayı belirler


       // System.out.println(sayi);
       System.out.println("0-100 Arasında Bir Sayı Tuttum. Bulabilirmisin ?");

       int i=0;


       
        for ( i = 1; i < 11; i++) {
            System.out.print("Tahmininiz :");
            int tah = al.nextInt();
            if (tah < sayi) {
                System.out.println("BÜYÜLT  ; " + (10-i)  +" Hakkınız Kaldı");

            } else if (tah > sayi) {
                System.out.println("KÜÇÜLT  ; " + (10-i)  +" Hakkınız Kaldı");
            } else {
                System.out.println("BRAVO " + i + " Tahminde Bildiniz");
                i = 50;
            }
        }

        if (i == 11) System.out.println("Tahmin Hakkınız Bitti. Sayı :  "+ sayi);

    }
}
