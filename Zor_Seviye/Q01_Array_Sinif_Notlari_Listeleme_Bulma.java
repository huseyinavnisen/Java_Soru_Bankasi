package Soru_Bankasi.Zor_Seviye;

import java.util.Scanner;

public class Q01_Array_Sinif_Notlari_Listeleme_Bulma {

    public static void main(String[] args) {

       /*
       Örnek : Java dersine giren 10 kişilik bir sınıftaki öğrencilerin isimleri, vize - final notları  ve proje Notları üç ayrı dizide tutulmaktadır.
       Not: dizilerdeki index numarası aynı olan elemenlar aynı kişiye ait bilgileri temsil etmektedir.

        String isimler[]={"Adem","Emsal","Ayşe","Yasemin","Gülşah","Hüseyin","Birol","Cihan","Hatice","Selim"}
        int vizeFinalNotu[][]={{65,85},{75,90},{92,55},{68,72},{68,75},{75,55},{85,90},{65,56},{55,88},{72,86}}
        int projeNotu[]={100,50,0,50,68,78,85,90,98,100};


         I - Vize Notunun %30'u , Final notunun % 50'si, Proje Notunun %20'si alınarak ortalama bulunacak ve "ortalamaNotu" adlı dizide saklanacaktır.
            Örnek  : Vize ve Final Notu : 65,85; Proje notu : 100  olan bir öğrencinin ortalama Notu ==> 65*0,3 + 85*0,5 + 80*0,2 = 78

         II - Tüm sınıfın vize, Final, Proje ve Ortalama notlarını alt alta sıralayın.
         Örnek : JAVA 82 SINIFININ NOT LİSTESİ
                  ADI      V   F    P    ORT
                  Adem    100 100 100 100.0
                  Emsal    50 50 50 50.0  gibi

         III - Sınıfın Ağırlıklı not ortalamasını bulun ve yazdırın; ( Tüm öğrencilerin ortalamasının, öğrenci sayısına bölünmesi ile bulunur. )
            Örnek : Java 82 sınıfının Ağrırlıklı Not Ortalaması : 62,26 gibi

         IV - Ağırlıklı Sınıf Not Ortalamasından daha düşük not ortalamasına sahip kişileri
         BÜTÜNLEMEYE GELECEK ÖĞRENCİLER şeklinde isimleri ve karşılarına not ortalamaları gelecek şekilde
           Örnek : BÜTÜNLEMEYE KALAN ÖĞRENCİLER
                   Adı                 Ortalaması
                   Hüseyin               55.26
                   Hatice                61.25   gibi



       */

        Scanner al = new Scanner(System.in);
        String isimler[] = {"Adem", "Emsal", "Ayşe", "Yasemin", "Gülşah", "Hüseyin", "Birol", "Cihan", "Hatice", "Selim"};
        int vizeFinalNotu[][] = {{65, 85}, {75, 90}, {92, 55}, {68, 72}, {68, 75}, {75, 55}, {85, 90}, {65, 56}, {55, 88}, {72, 86}};
        int projeNotu[]={100,50,0,50,68,78,85,90,98,100};

        double ortalamaNotu[] = new double[10];


        for (int i = 0; i < 10; i++) {
            ortalamaNotu[i] = (vizeFinalNotu[i][0]) * 0.3 + (vizeFinalNotu[i][1]) * 0.5 + projeNotu[i]*0.2;
        }



        System.out.println("JAVA 82 SINIFININ NOT LİSTESİ");
        System.out.println("ADI      V   F    P    ORT ");
        for (int i = 0; i <10 ; i++) {
            System.out.println(isimler[i]+"    " + vizeFinalNotu[i][0]+ " " + vizeFinalNotu[i][1]+" "+projeNotu[i]+ " "+ ortalamaNotu[i]);
        }


        System.out.println(".....................................");
        double agirlikliNotOrtalamasi =0;

        for (int i = 0; i <10 ; i++) {
           agirlikliNotOrtalamasi+=(ortalamaNotu[i])/10;        // * daha sonra   /10 olacak
        }
        System.out.println("Java 82 sınıfının Ağrırlıklı Not Ortalaması : " + agirlikliNotOrtalamasi);


        System.out.println(".....................................");
        System.out.println("BÜTÜNLEMEYE KALAN ÖĞRENCİLER");
        System.out.println("Adı        Ortalama Notu");

        for (int i = 0; i <10 ; i++) {
            if(ortalamaNotu[i]<agirlikliNotOrtalamasi) {
                System.out.println(isimler[i] + "      " + ortalamaNotu[i]);
            }
        }


    }


}










