package StdPortal;

import java.util.Scanner;

public class AnaMenu {

    public static void main(String[] args) {
        homepage();
    }

    private static void homepage(){
        Scanner scanner=new Scanner(System.in);
        OgrenciEkleme og = new OgrenciEkleme();
        og.createTable();

        String menuSecimi;

        do {
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

            menuSecimi = scanner.nextLine();

            switch (menuSecimi) {
                case "1":
                    og.addStudent();
                    break;
                case "2":
                 //OgrenciNoAtama.ogrenciNoAtama();
                    break;
                case "3":
                  //Derskayit.derssecme();
                    break;
                case "4":
                  //Odeme.harcMiktari();
                    break;
                case "5":
                  //Odeme.odemeYap();
                    break;
                case "6":
                 //Odeme.kalanBorc();
                    break;
                case "7":
                  //  sonDurum();
                    break;
                case "8":
                 //   cikis();
                    System.out.println("Sistemden Cikiliyor...");
                    break;
                default:
                    System.out.println("Hatali tuslama yaptiniz!");
                    break;
            }
        } while (!menuSecimi.equals("8"));
    }

}

