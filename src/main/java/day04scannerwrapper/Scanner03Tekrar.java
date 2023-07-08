package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03Tekrar {

    public static void main(String[] args) {
        //Ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("lütfen ikinci sayiyi giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("sayi1 * sayi2= " + sayi1 + sayi2);
    }


}
