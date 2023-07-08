package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Task2a {


    /*Q01 TASK :
     * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
     *  dort islemden biri ile isleme koyup sonucun yazdiriniz
     */
    /*Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için Scanner obj create ettik.
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
    kullanıcıya seçim içn işlem menusu yazdırdık*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ilk sayiyi giriniz :");
        double num1 = input.nextInt();
        System.out.println("lütfen ikinci sayiyi giriniz:");
        double num2 = input.nextInt();
        System.out.println("************");
        System.out.println("Lütfen dort islem icin asagidaki seceneklerden birini giriniz:\n" + "(1)toplama  \n" + "(2)cikarma  \n" + "(3)bolme \n" + "(4)carpma ");
        int dortIslem = input.nextInt();
        if (dortIslem == 1) {
            System.out.println(num1 + num2);
        } else if (dortIslem == 2) {
            if (num1 < num2) {
                System.out.println("sonuc : " + (num1 - num2));
            } else {
                System.out.println("sonuc : " +(num1 - num2));
            }
        } else if (dortIslem == 3) {
            System.out.println("sonuc : " +(num1 / num2));
        } else if (dortIslem == 4) {
            System.out.println("sonuc : " + (num1 * num2));
        } else {
            System.out.println("lutfen gecerli bir islem numarasi giriniz !");
        }


    }
}
