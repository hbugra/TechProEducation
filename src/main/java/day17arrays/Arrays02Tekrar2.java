package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02Tekrar2 {

    public static void main(String[] args) {
        // Ornek 1: Kullanicinin coklu data yi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1)Kullanicidan data almak icin Scanner object olustur
        2)Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dizin olusturmak istediginiz dizin sayisini giriniz: ");
        int idx = scan.nextInt();
        String a[] = new String[idx];

        for(int i=0; i<a.length; i++){
            System.out.println("lutfen string giriniz: ");
            String b = scan.next();
            a[i] = b;
        }
        System.out.println(Arrays.toString(a));


    }


}
