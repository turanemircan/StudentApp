package StdPortal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Odeme {
    static Scanner input = new Scanner(System.in);
    static final int TEK_DERS_UCRETI = 600;

    public static int harcMiktari() {
        try {
            System.out.print("Ödemek istediğiniz Ders Sayisini Giriniz: ");
            int dersSayisi = input.nextInt();
            int toplamHarc = dersSayisi * TEK_DERS_UCRETI;
            System.out.println("Toplam Harc Miktari: " + toplamHarc);
            return toplamHarc;
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
            input.nextLine();
            return harcMiktari();
        }
    }
    public static int odemeYap() {
        try {
            System.out.print("Lütfen Yapacağınız Ödeme Tutarını Belirtiniz: ");
            int miktar = input.nextInt();
            if(miktar<0){

                System.out.println("Hatali Giriş Yaptiniz");
                return odemeYap();
            }
            int toplamHarc = harcMiktari();

            int kalanBorc = toplamHarc - miktar;
            String durum;

            switch (Integer.compare(kalanBorc, 0)) {
                case 0:
                    durum = "Ödemeniz Gerçekleşti";
                    break;
                case 1:
                    durum = "Eksik Harc Miktari";
                    break;
                default:
                    durum = "Fazla Harc Miktari";
                    break;
            }

            System.out.println("Durum: " + durum);
            return kalanBorc;
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.");
            input.nextLine();
            return odemeYap();
        }
    }

    public static void kalanBorc() {
        odemeYap();
    }}
