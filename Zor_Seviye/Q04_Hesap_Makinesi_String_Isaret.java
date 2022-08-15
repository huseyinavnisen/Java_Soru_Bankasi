package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q04_Hesap_Makinesi_String_Isaret {

    public static void main(String[] args) {
        Scanner al = new Scanner(System.in);

        System.out.print("İki sayıyı işlem işareti ile birlikte giriniz: ");
        String sayi = al.next();
        System.out.println("İşlemin Sonucu : " + islem(sayi));

    }

    private static double islem(String sayi) {

        int isaretIndex = 0;
        String sayi1 = "";
        String sayi2 = "";
        double sonuc = 0;
        String islemIsaret = "";

        sayi = sayi.replace(" ", ""); // yanlışlıkla girilebilecek boşluklar silindi
        islemIsaret = sayi.replaceAll("\\d", ""); // tüm rakamlar yerine hiçlik atandı sadece işlem işareti kaldı

        for (int i = 0; i < sayi.length(); i++) {
            if (sayi.charAt(i) < 48 || sayi.charAt(i) > 57) { // sıra ile bakılan karakterin ASCII değeri; sayı aralığı dışında ise
                isaretIndex = i;                                           // İşlemin işaretinin indexi bulunmuş olur.
            }
        }
        sayi1 = sayi.substring(0, isaretIndex); // isaretin indexine kadar olan kısım alındı ve sayi1'e atandı
        sayi2 = sayi.substring(isaretIndex + 1, sayi.length());  // işsretin indexinden bir sonra başlayarak sona kadar olan kısım sayı2 ye aktarıldı

        double gerceksayi1 = Double.parseDouble(sayi1); // string girilen sayı1 double dönüştürüldü ve gerceksayi1'e aktarıldı
        double gerceksayi2 = Double.parseDouble(sayi2);   // string girilen sayı2 double dönüştürüldü ve gerceksayi2'e aktarıldı

        if (islemIsaret.equals("+")) {
            sonuc = gerceksayi1 + gerceksayi2;
        } else if (islemIsaret.equals("-")) {
            sonuc = gerceksayi1 - gerceksayi2;
        } else if (islemIsaret.equals("/")) {
            sonuc = gerceksayi1 / gerceksayi2;
        } else if (islemIsaret.equals("*")) {
            sonuc = gerceksayi1 * gerceksayi2;
        } else System.out.println(" Hatalı İşlem Tipi Seçtiniz");

        return sonuc;
    }


}














