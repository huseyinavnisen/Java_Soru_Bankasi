package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Faktöriyeli alınacak sayıyı girin: ");
        int sayi = scan.nextInt();

        int fak = 1;

        if (sayi < 0 && sayi>20) { // taşma olmasın diye >20 koyduk
            for (int i = -1; i >= sayi; --i) {
                fak = fak * i;
            }
            System.out.println(sayi + "! =" + fak);
        } else if (sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                fak *= i;
            }
            System.out.println(sayi + "! =" + fak);
        } else System.out.println("0!= 1 ");


    }
}
