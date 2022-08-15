package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Interview_Sorusu_JAVA_GUZELDIR {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println(" 1 - 100 arası bir sayı girin : ");
        int sayi = scan.nextInt();

        if (sayi > 100 || sayi < 0) {
            System.out.println(" 1 - 100 arası bir sayı girmen gerekiyor");
        } else {

            for (int i = 1; i <= sayi; ++i) {

                if ((i%3==0)&&(i%5==0)) {
                    System.out.print(" JAVA GÜZELDİR ");
                } else if (i % 5 == 0) {
                    System.out.print(" GÜZELDİR ");
                } else if (i%3==0){
                    System.out.print(" JAVA ");
                }
                else System.out.print(i+" ");

            }
        }
    }
}

