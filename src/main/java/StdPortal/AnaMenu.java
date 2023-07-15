package StdPortal;

import java.util.Scanner;

public class AnaMenu {

    private void anaMenu() {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("DEV4-UNIVERSITESINE HOSGELDINIZ\n"
                    + "*\t*\t* LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECIN *\t*\t*");
            System.out.println("\t1- Ogrenci Ekle\n"
                    + "\t2- Ogrenci No\n"
                    + "\t3- Ders Kayit\n"
                    + "\t4- Harc Bilgisi\n"
                    + "\t5- Yapilan Odeme Bilgisi\n"
                    + "\t6- Kalan Borc\n"
                    + "\t7- Son Durum\n"
                    + "\t8- CIKIS");

            String menuSecimi = scanner.nextLine();

            switch (menuSecimi) {
                case "1":
                   //ogrenci ekleme
                    break;
                case "2":
                  //  ogrenciNoAtama();
                    break;
                case "3":
                  //  dersKayitMenusu();
                    break;
                case "4":
                  //  harcMiktari();
                    break;
                case "5":
                 //   yapilanOdeme();
                    break;
                case "6":
                 //   kalanBorc();
                    break;
                case "7":
                  //  sonDurum();
                    break;
                case "8":
                 //   cikis();
                    System.out.println("Sistemden Cikiliyor...");
                    return;
                default:
                    System.out.println("Hatali tuslama yaptiniz!");

            }
        }
    }

}

