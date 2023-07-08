package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01Tekrar {
    //Ornek 4: Kullanicidan iki sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz: ");
        int num1 = input.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz: ");
        int num2 = input.nextInt();

        String a = num1>=num2 ? "birinci sayi büyük":"ikinci sayi büyük";
        System.out.println("a = " + a);
    }

}
