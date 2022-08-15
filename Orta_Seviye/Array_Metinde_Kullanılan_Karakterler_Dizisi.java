package Soru_Bankasi.Orta_Seviye;

import java.util.Arrays;

public class Array_Metinde_Kullanılan_Karakterler_Dizisi {
    public static void main(String[] args) {

        // Verilen bir metin içinde kullanılan harfleri, bir diziye aktarın ve yazdırın.
        // metinde kullanılan bir karakter diziye daha önce aktarılmış ise ikinci defa aktarılmayacaktır.
        // Boşluklar diziye aktarılmayacaktır.
        // Oluşturulacak Char dizinin eleman sayısı içine aktarılacak karakter adeti olacaktır.


        String metin = "Ey Türk gençliği! Birinci vazifen; Türk istiklalini, Türk cumhuriyetini, ilelebet muhafaza ve müdafaa etmektir";

        metin = metin.replace(" ", ""); // Boşluklar silindi
        String yenimetin = "";


        for (int i = 0; i < metin.length(); i++) {
            if (!yenimetin.contains(metin.charAt(i) + "")) { // "" işareti koyularak char ifade metine aktarılabildi.
                yenimetin += metin.charAt(i);

            }
        }

        char dizi[] = new char[yenimetin.length()]; //

        for (int i = 0; i < yenimetin.length(); i++) {
            dizi[i] = yenimetin.charAt(i);
        }
        System.out.println(" Metinde Kullanılan Karakterlerin oluşturduğu dizi : " + Arrays.toString(dizi));

    }
}






