package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class Method_Cumleyi_Tersten_Yazma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Cümle veya Kelimeyi Girin :");
        String cumle = scan.nextLine();

        System.out.println(tersyaz(cumle));
    }

    public static String tersyaz(String str) {
        String tersi = "";

        for (int i = str.length(); i >= 1; i--) {
            tersi+= str.substring(i - 1, i);
        }
        return tersi;
    }
}
