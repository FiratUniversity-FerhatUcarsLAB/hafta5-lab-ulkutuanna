/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [08.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class FizikFormül {
    //Evrensel sabit: Yerçekimi ivmesi
    public static final double g = 9.81; 

    //Hız hesaplama metodu
    public static double hizHesapla(double yol, double zaman) {
        return yol / zaman;
    }

    //İvme hesaplama metodu 
    public static double ivmeHesapla(double hizDegisimi, double zaman) {
        return hizDegisimi / zaman;
    }

    //Kuvvet hesaplama metodu
    public static double kuvvetHesapla(double kutle, double ivme) {
        return kutle * ivme;
    }

    //İş hesaplama metodu
    public static double isHesapla(double kuvvet, double yol) {
        return kuvvet * yol;
    }

    //Güç hesaplama metodu
    public static double gucHesapla(double is, double zaman) {
        return is / zaman;
    }

    //Kinetik enerji hesaplama metodu
    public static double kinetikEnerjiHesapla(double kutle, double hiz) {
        return 0.5 * kutle * Math.pow(hiz, 2);
    }

    //Potansiyel enerji hesaplama metodu 
    public static double potansiyelEnerjiHesapla(double kutle, double yukseklik) {
        return kutle * g * yukseklik;
    }

    //Momentum hesaplama metodu 
    public static double momentumHesapla(double kutle, double hiz) {
        return kutle * hiz;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Fizik Formül Hesaplayici ===");
        System.out.println();

        System.out.print("\nYol (metre):");
        double s = input.nextDouble();

        System.out.print("Zaman (saniye):");
        double t = input.nextDouble();

        System.out.print("Başlangiç ve bitiş hizi farki (m/s):");
        double deltaV = input.nextDouble();

        System.out.print("kütle (kg): ");
        double m = input.nextDouble();

        System.out.print("Yükseklik (metre):");
        double h = input.nextDouble();

        System.out.print("Mesafe (metre):");
        double d = input.nextDouble();

        double v = hizHesapla(s, t);
        double a = ivmeHesapla(deltaV, t);
        double F = kuvvetHesapla(m, a);
        double W = isHesapla(F, d);
        double P = gucHesapla(W, t);
        double KE = 0.5 * m * Math.pow(v, 2);
        double PE = potansiyelEnerjiHesapla(m, h);
        double p = momentumHesapla(m, v);

        System.out.println("====================================");
        System.out.println("      HESAP SONUÇLARI");
        System.out.println("====================================");

        System.out.println("\nHIZ VE HAREKET:");
        System.out.printf("Hız: %.2f m/s%n", v);
        System.out.printf("İvme: %.2f m/s²%n", a);

        System.out.println("\nKUvVET, İŞ VE GÜÇ:");
        System.out.printf("Kuvvet: %.2f N%n", F);
        System.out.printf("İş: %.2f J%n", W);
        System.out.printf("Güç: %.2f W%n", P);

        System.out.println("\nENERJİ VE MOMENTUM:");
        System.out.printf("Kinetik Enerji: %.2f J%n", KE);
        System.out.printf("Potansiyel Enerji: %.2f J%n", PE);
        System.out.printf("Momentum: %.2f kg·m/s%n", p);

        System.out.println("====================================");


        input.close();
    }
}
