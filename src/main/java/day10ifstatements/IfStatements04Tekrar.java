package day10ifstatements;

import java.util.Scanner;

public class IfStatements04Tekrar {

    /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir yas aralıgı giriniz: ");
        int age = input.nextInt();

        if(age<0){
            System.out.println("bebek");
        }else if (age<4){
            System.out.println("cocuk");
        }else if(age<12){
            System.out.println("genc");
        }else if(age<20){
            System.out.println("genc");
        }else if(age<30){
            System.out.println("yetiskin");
        }else if(age>30){
            System.out.println("tanimlanmamis");
        }else{
            System.out.println("gecerli bir yas giriniz: ");
        }

    }

}
