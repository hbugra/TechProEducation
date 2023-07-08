package day10ifstatements;

import java.util.Scanner;

public class IFStatements01Tekrar {
    //Ornek: Verilen bir sayinin pozitif, negatif yada notr oldugunu kontrol eden kodu yaziniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        int num = input.nextInt();

        if(num>0){
            System.out.println("sayi pozitiftir.");
        }
        else if(num<0){
            System.out.println("sayi negatiftir.");
        }
        else{
            System.out.println("sayi notr dur ");
        }

    }


}
