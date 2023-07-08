package day14loops;

import java.util.Scanner;

public class Loops03Tekrar {

    public static void main(String[] args) {

        /*   Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
             Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
             9 - 14 ==> 10  12  14     */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz: ");
        int a = input.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz: ");
        int b = input.nextInt();

        if(a>b){
            for(int x = a; x>=b; x--){
                if(x%2==0){
                    System.out.println(x);
                }
            }
        }
        for(int i = a; i<=b; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Ornek 2 : Hic sayi kullanmadan 1 den 50 e kadar olan sayilari console a yazdiriniz
        for(int i = 'd'/'d'; i<='d'; i++){
            System.out.print(" " + i);
        }



    }






}
