package StdPortal;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Derskayit {
    public static void dersAdi(){

       // Dersler tarihDersi= new Dersler("Tarih","101",600);


        TreeMap<String, String> dersvekodu = new TreeMap<>();
        dersvekodu.put("101","Tarih");
        dersvekodu.put("103","Matematik");
        dersvekodu.put("105","İngilizce");
        dersvekodu.put("107", "Kimya");
        dersvekodu.put("109","Bilgisayar Bilimleri");

        System.out.printf("%-15s %-15s\n", "Ders Kodu", "Ders Adı");
        for (Map.Entry<String,String> entry : dersvekodu.entrySet()) {
            String dersKodu = entry.getKey();
            String dersAdi = entry.getValue();
            System.out.printf("%-15s %-15s\n", dersKodu , dersAdi);
        }
    }

    public static void derssecme() {
        Scanner input = new Scanner(System.in);
        Derskayit.dersAdi();
        int derssayi;
        System.out.println("Kaç derse kaydolmak istediğinizi rakamla yazınız");
         try {
            derssayi = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş! Lütfen 0 ile 5 arasında rakam girin girin.");
            return;
        }
        if (derssayi==0){
            System.out.println("Ders seçmediniz. İyi günler");
        } else {
            TreeMap<String, String> secilenders = new TreeMap<>();
            for (int i = 0; i < derssayi; i++) {
                System.out.println("Kaydolmak istediğiniz dersin kodunu giriniz");
                String secim = input.nextLine();
                switch (secim) {
                    case "101":
                        secilenders.put("101", "Tarih");
                        break;
                    case "103":
                        secilenders.put("103", "Matematik");
                        break;
                    case "105":
                        secilenders.put("105", "İngilizce");
                        break;
                    case "107":
                        secilenders.put("107", "Kimya");
                        break;
                    case "109":
                        secilenders.put("109", "Bilgisayar Bilimleri");
                        break;
                    default:
                        System.out.println("Hatalı kod girdiniz");
                        i--;
                }
            }
            System.out.println("Seçilen kurslar şunlardır:" + secilenders);
        }
    }

}