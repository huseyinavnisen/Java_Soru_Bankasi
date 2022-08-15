package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Cumleyi_Tersten_Yaz_Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Metin  Girin :");
        String cumle = scan.nextLine();
        String ters = "";

        for (int i = cumle.length(); i >= 1; i--){
            ters+=cumle.substring(i - 1, i);
        }
        if (cumle.equals(ters)) {
            System.out.println("Girdiğiniz Metin Palindrom'dur");
        } else System.out.println("Girdiğiniz Metin Palindrom değildir");
    }
}
