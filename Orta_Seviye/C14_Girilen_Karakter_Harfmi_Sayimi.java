package Soru_Bankasi.Orta_Seviye;

import java.util.Scanner;

public class C14_Girilen_Karakter_Harfmi_Sayimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("karakter giriniz:"); // Console da metin yazıyoruz
        char c = scan.nextLine().charAt(0);  // char olarak bir harf veya sayı girişi yapıyoruz.


        if ((c>='a' && c<='z') || (c>='A' && c<='Z')) System.out.println("HARF GİRDİN");
        else System.out.println("GİRİLEN KARAKTER BİR HARF DEĞİL  ");





    }
}
