package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a)Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println(shortSide * longSide);
        System.out.println(2 * shortSide + 2 * longSide);

    }
}