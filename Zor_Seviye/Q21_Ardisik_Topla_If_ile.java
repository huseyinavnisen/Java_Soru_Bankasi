package Soru_Bankasi.Zor_Seviye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q21_Ardisik_Topla_If_ile {

    /*
            input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
            output : { 3, 5+1, 2+7+9, 2+3+5+7 }
        */
    public static void main(String[] args) {
        List<Integer> bosList = new ArrayList<>();
        int[] input = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};


        int ds = 1;
        int b=1;
        int top = 0;

        for (int i = 0; i <input.length; ) {
            top = 0;
            for (b=1; b <= ds; b++) {
                top += input[i];
                i++;
            }
            ds++;
            bosList.add(top);
        }


        System.out.println("Dizinin İlk Durumu       :"+ Arrays.toString(input));
        System.out.println("Ardışık Toplanmış Durumu :" + bosList);

    }


}
