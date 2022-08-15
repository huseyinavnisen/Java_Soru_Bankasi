package Soru_Bankasi.Zor_Seviye;
import java.util.Scanner;
public class Q14_Ucak_Bileti_Hesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uçus Mesafesini Girin (KM) :");
        int um = scan.nextInt();
        System.out.print("Yolcunun Yaşını Girin  :");
        int yas = scan.nextInt();
        System.out.print("1 => Tek Yön  /  2 => Gidiş Dönüş :");
        int yon = scan.nextInt();

        double nt, indtut, yi = 0;

        nt = (um * 0.1); // Normal Tutar Hesaplanır.

        if (yas < 12) {    // Yaşa göre Yaş indirimi hesaplanır ve (yi) değişkenine atanır.
            yi = nt * 0.5;
        } else if (yas < 24) {
            yi = nt * 0.1;
        } else if (yas > 65) {
            yi = nt * 0.3;
        } else yi = 0;

        indtut = nt - yi; // Yaşa Göre Hesaplanan İndirim, Normal tutardan çıkartılır ve İndirimli Tutar Bulunur.

        if (yon == 2) indtut = 2 * 0.8 * indtut; // Eğer gidiş-Dönüş seçmiş ise indirimli 2 bilet parası üzerinden bir %20 daha  indirim yapılır

        if ((yon != 1 && yon != 2) || um < 0 || yas < 0) {
            System.out.println("Hatalı Bilgi Girdiniz");
        } else    System.out.println("Normal Tutar : " + indtut); // Sonuç ekrana yazdırılır

    }
}
