package Soru_Bankasi.Orta_Seviye;

public class C01_Dizideki_Eksik_Sayiyi_Dondur {
    public static void main(String[] args) {
        int dizi1[] = {1, 2, 3, 5, 6, 7, 8, 10, 9};
        int dizi2[] = {7, 2, 3, 10, 5, 9, 1, 4, 8};
        int dizi3[] = {7, 5, 1, 2, 4, 6, 8, 3, 9};
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi1)); // 4
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi2)); // 6
        System.out.println("Dizide Eksik Olan Eleman :" + eksikbul(dizi3)); // 10
    }
   public static int eksikbul(int[] dizi) {
        int top = 0;
        for (int i = 0; i < dizi.length; i++) {
            top += dizi[i];
        }
        return 55 - top;
    }


}
