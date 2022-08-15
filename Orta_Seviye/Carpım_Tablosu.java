package Soru_Bankasi.Orta_Seviye;


public class Carpım_Tablosu {
    public static void main(String[] args) {

        /*    1 - 9 arası Rakamların Çarpım Tablosu

        1x1 =1   1x2 =2  ......   1x9=9
        2x1 =2   2x2=2 .......  2x9 =18
        ...............................
        9x1=9    9x2=18.........9x9=81

        */

        for (int i = 1; i <= 9; i++) {
            for(int k=1; k<=9; k++){
                System.out.print(i+ "X" +k + "=" +i*k + "  ");
        }
            System.out.println("");
    }
}
}
