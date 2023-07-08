package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05Homework {

    public static void main(String[] args) {
        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama (3+5+7)/3=5


       /* Scanner input = new Scanner(System.in);
        System.out.println("lütfen birinci sayiyi giriniz: ");
        float sayi1 = input.nextFloat();
        System.out.println("lütfen ikinci sayiyi giriniz: ");
        double sayi2 = input.nextDouble();
        System.out.println("lütfen ücüncü sayiyi giriniz: ");
        long sayi3 = input.nextLong();
        double sonuc = (sayi1 + sayi2 + sayi3)/3;
        System.out.println("üc sayinin ortalaması: " + sonuc);*/

        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input1 = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayi giriniz: ");
        int sayi = input1.nextInt();

        int birlerBasamagi = sayi % 10;
        sayi = sayi / 10;
        int ikinciBasamak = sayi % 10;
        sayi = sayi / 10;
        int ucuncuBasamak = sayi;

        System.out.println("sayilarin rakamları toplamı : " + (birlerBasamagi + ikinciBasamak + ucuncuBasamak));

    }
}
