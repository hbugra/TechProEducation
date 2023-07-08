package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01Tekrar {

    public static void main(String[] args) {

        /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin

           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz: ");
        String gender = scan.next().toLowerCase();
        System.out.println("0'dan kucuk 120'den buyuk bir deger giriniz: ");
        int age = scan.nextInt();

        if(age<0 || age>120){
            System.out.println("0'dan kucuk 120'den buyuk bir deger giriniz: ");
        }

        else if(gender.equalsIgnoreCase("erkek")){
            if(age<65){
                System.out.println("calismaya devam");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        }
        else if(gender.equalsIgnoreCase("kadın")){
            if(age>60){
                System.out.println("emekli olabilirsiniz");
            }else{
                System.out.println("calismalisiniz");
            }
        }else{
            System.out.println("tanimli degil");
        }


    }

}
