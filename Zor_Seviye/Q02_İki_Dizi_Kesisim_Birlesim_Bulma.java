package Soru_Bankasi.Zor_Seviye;

public class Q02_İki_Dizi_Kesisim_Birlesim_Bulma {
    public static void main(String[] args) {
/*
iki adet MDA dizide bulunan elemanların ( küme elemanı gibi düşünün )
kesişim kümesini ve birleşim kümesini ayrı ayrı yazdıran JAVA kodu yazınız.

input : String [][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String [][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};
output:  Dizilerin Kesişim Kümesi : 2c
         Dizilerin Birleşim Kümesi : a2c75kr1e8
 */
        String[][] dizi1 = {{"a", "2", "c", "7"}, {"5", "k"}, {"7", "r"}};
        String[][] dizi2 = {{"1", "e"}, {"2", "e", "c"}, {"8", "1"}};

        String dizi1String = "";
        String dizi2String = "";



        for (int i = 0; i < dizi1.length; i++) {
            for (int j = 0; j < dizi1[i].length; j++) {
                if (!dizi1String.contains(dizi1[i][j])) {
                    dizi1String += dizi1[i][j];
                }
            }
        }

       // System.out.println("Dizi1 Küme Hali:  "+ dizi1String);

        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                if (!dizi2String.contains(dizi2[i][j])) {
                    dizi2String += dizi2[i][j];
                }
            }
        }
        //  System.out.println("Dizi2 Küme Hali:  "+dizi2String);

        String diziKesisim = "";
        for (int i = 0; i <dizi1String.length() ; i++) {
            if((dizi2String).contains(dizi1String.substring(i,i+1))){
               diziKesisim+= dizi1String.substring(i,i+1);
            }
        }

        String diziBirlesim = dizi1String; //
        for (int i = 0; i <dizi2String.length() ; i++) {
            if(!(dizi1String).contains(dizi2String.substring(i,i+1))){
                diziBirlesim+= dizi2String.substring(i,i+1);
            }
        }
        System.out.println("Dizilerin Kesişimi : "+ diziKesisim);
        System.out.println("Dizilerin Birleşimi : "+ diziBirlesim);
    }


}

