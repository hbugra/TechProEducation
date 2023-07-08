package day13loops;

import java.util.Scanner;

public class Loops01Tekrar01 {


    public static void main(String[] args) {

        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //      ankara  ==> AKR

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz: ");
        String a = input.next();

            String toplam ="";

                for(int i = 0; i<a.length(); i++){

                    if(i%2==0){
                        toplam = toplam + a.charAt(i);

                    }

                }System.out.println(toplam.toUpperCase());




       /* for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }
        }*/


    }
}