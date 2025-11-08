/*
 * Ad Soyad: [Ülkü Tuanna Kara]
 * Ogrenci No: [250541077]
 * Tarih: [08.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {
    final static double KDV_ORANI = 0.18;
    final static double SHIPPING_FEE = 29.99;

    public static double calculateTotalPrice(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateKDV(double total) {
        return total * KDV_ORANI;
    }

    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100);
    }

    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TİCARET SEPET HESAPLAYICI ===");
        System.out.println("\nLütfen 3 ürünün bilgilerini giriniz:");

        System.out.print("\nÜRÜN 1 - Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("Adet: ");
        int quantity1 = input.nextInt();

        System.out.print("\nÜRÜN 2 - Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("Adet: ");
        int quantity2 = input.nextInt();

        System.out.print("\nÜRÜN 3 - Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("Adet: ");
        int quantity3 = input.nextInt();

        System.out.print("\nİndirim kuponu yüzdesi (%): ");
        double discountPercentage = input.nextDouble();

        
        double line1 = calculateTotalPrice(price1, quantity1);
        double line2 = calculateTotalPrice(price2, quantity2);
        double line3 = calculateTotalPrice(price3, quantity3);
        double subtotal = line1 + line2 + line3;

        double discountAmount = calculateDiscountAmount(subtotal, discountPercentage);
        double discountedTotal = calculateDiscountedTotal(subtotal, discountAmount);
        double vatAmount = calculateKDV(discountedTotal);
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE);

        System.out.println("\n===================================");
        System.out.println("           SEPET ÖZETİ");
        System.out.println("===================================");

        System.out.printf("Ürün 1 Toplam Fiyat: %.2f TL%n", line1);
        System.out.printf("Ürün 2 Toplam Fiyat: %.2f TL%n", line2);
        System.out.printf("Ürün 3 Toplam Fiyat: %.2f TL%n", line3);
        System.out.println("-----------------------------------");

        System.out.printf("Ara Toplam: %.2f TL%n", subtotal);
        System.out.printf("İndirim Miktarı: %.2f TL%n", discountAmount);
        System.out.printf("İndirimli Toplam: %.2f TL%n", discountedTotal);
        System.out.printf("KDV Tutarı: %.2f TL%n", vatAmount);
        System.out.printf("Kargo Ücreti: %.2f TL%n", SHIPPING_FEE);
        System.out.println("-----------------------------------");

        System.out.printf("Genel Toplam: %.2f TL%n", grandTotal);
        System.out.println("===================================");

        input.close();
    }
}
