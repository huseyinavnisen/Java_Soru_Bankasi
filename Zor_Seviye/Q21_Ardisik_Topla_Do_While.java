package Soru_Bankasi.Zor_Seviye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21_Ardisik_Topla_Do_While {

    /*
            input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
            output : { 3, 5+1, 2+7+9, 2+3+5+7 }
        */
    public static void main(String[] args) {
        List<Integer> bosList = new ArrayList<>();

        int[] input = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };


        int index= 0; // Array elemanlarını kullanmak için alacağımız değişken
        int ds = 1; // döngü sonunu kontrol eden değişken
        int b = 1; // döngü başını kontrol eden sabit
        int top = 0; // Dizi elemalnalrını toplamını alacağımız değişken

        do {
            top = 0; // toplam değişkeni her döngü başında sıfırlanıyor.
            for (b = 1; b <= ds; b++) {
                top += input[index];
                index++;
            }
            ds++;
            bosList.add(top);
        } while (index<input.length);


        System.out.println("Dizinin İlk Durumu       :" + Arrays.toString(input));
        System.out.println("Ardışık Toplanmış Durumu :" + bosList);

    }


}
