package Soru_Bankasi.Zor_Seviye;
import java.util.ArrayList;
import java.util.List;
public class Q03_Sehirleri_Karakter_Uzunluguna_Gore_Sirala {
    /*
    Verilen String bir dizideki elemanları karakter uzunluğuna göre büyükten küçüğe doğru sıralayın.
    input : String sehirler[] = {"Trabzon","Çanakkale","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
    output: [Çanakkale, İstanbul, Trabzon, Ankara, Hatay, İzmir, Ağrı, Rize, Muş, Van]
     */
    public static void main(String[] args) {
        String sehirler[] = {"Trabzon","Çanakkale","Ankara","Muş","Ağrı","Hatay","İstanbul","Van","Rize","İzmir"};
        List<String> listSehirler = new ArrayList<>();
        for (String each : sehirler) {
            listSehirler.add(each);
        }
        System.out.println("Şehirler Listi  :" + listSehirler);
        List<String> listsiralisehir = new ArrayList<>();

        for (int i = 0; i <listSehirler.size(); i++) {
           int index = 0;  int uzunkarakter = 0; // her for=i döngüsü başında index ve uzunkarakter resetleniyor yani sıfıra atanıyor.
            for (int j = 0; j <listSehirler.size(); j++) {
                if (listSehirler.get(j).length() > uzunkarakter) {
                    uzunkarakter = listSehirler.get(j).length();
                    index = j;
                }
            }
            listsiralisehir.add(listSehirler.get(index)); // ilk for=i döngüsü sonucu listede bulunan en uzun şehir, boş liste ekleniyor.
            listSehirler.set(index,""); // İlk listeden bulunan elemena boşluk atayarak ikinci aramada bulunmamasını sağlıyoruz
        }
        System.out.println("Sıralı Şehirler :" + listsiralisehir);
    }
}




