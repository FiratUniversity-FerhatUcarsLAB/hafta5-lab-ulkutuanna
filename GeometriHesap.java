/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [08.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // Kare alanını hesaplayan metot
        public static double  calculateSquareArea(double kenar){
        return kenar * kenar ;
        }

// Kare çevresini hesaplayan metot
public static double calculateSquarePerimeter(double kenar) {
    double kenarlari_toplami = kenar * 4;
    return kenarlari_toplami;
}

//Dikdörtgen çevre hesaplayan metot
public static double dikdortgenCevreHesapla(double uzunluk, double genislik ){
    return 2 * (uzunluk + genislik);
}

//Dikdörtgen alan hesaplayan metot
public static double dikdortgenAlanHesapla(double uzunluk, double genislik ){
    return uzunluk * genislik;
}

// Daire alanını hesaplayan metot
public static final double PI = 3.14;
public static double daireAlaniHesapla(double radius ){
    return PI * radius * radius;
}

// Daire çevresini hesaplayan metot
public static double daireCevreHesapla(double radius){
    return  2 * PI * radius;
}

//Üçgen Çevresini hesaplayan metot
public static double ucgenCevreHesapla(double a, double b, double c ){
    return a + b + c;
}

//Üçgen Alanını hesaplayan metot
public static double ucgenAlanHesapla(double taban, double yukseklik){
    return (taban * yukseklik) / 2;
}
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("=== Geometrik Sekil Hesaplayici ===");
        System.out.println();

        System.out.println("KARE:");
        System.out.print("Kenar uzunlugu (cm) :");
        double squareSide = input.nextDouble();

        System.out.println("\nDIKDÖRTGEN:");
        System.out.print("Kisa kenar (cm) :");
        double recWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm) :");
        double recHeight = input.nextDouble();

        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm) :");
        double radius = input.nextDouble();

        System.out.println("\nÜCGEN:");
        System.out.print("Taban uzunlugu (cm) :");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm) :");
        double height = input.nextDouble();
        System.out.print("Birinci kenar (cm) :");
        double sideA = input.nextDouble();
        System.out.print("Ikinci kenar (cm) :");
        double sideB = input.nextDouble();
        System.out.print("Ucuncu kenar (cm) :");
        double sideC = input.nextDouble();

        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);
        double recArea = dikdortgenAlanHesapla(recWidth, recHeight);
        double recPerimeter = dikdortgenCevreHesapla(recWidth, recHeight);
        double circleArea = daireAlaniHesapla(radius);
        double circlePerimeter = daireCevreHesapla(radius);
        double triangleArea = ucgenAlanHesapla(base, height);
        double trianglePerimeter = ucgenCevreHesapla(sideA, sideB, sideC);
        
        System.out.println( "\n==== HESAP SONUCLARI ====");
        System.out.printf("Kare Alani: %.2f cm²\n", squareArea);
        System.out.printf("Kare Cevresi: %.2f cm\n", squarePerimeter);
        System.out.printf("Dikdörtgen Alani: %.2f cm²\n", recArea);
        System.out.printf("Dikdörtgen Cevresi: %.2f cm\n", recPerimeter);
        System.out.printf("Daire Alani: %.2f cm²\n", circleArea);
        System.out.printf("Daire Cevresi: %.2f cm\n", circlePerimeter);
        System.out.printf("Üçgen Alani: %.2f cm²\n", triangleArea);
        System.out.printf("Üçgen Cevresi: %.2f cm\n", trianglePerimeter);
        input.close();

   }
}

