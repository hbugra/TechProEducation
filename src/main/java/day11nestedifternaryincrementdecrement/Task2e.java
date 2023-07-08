package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Task2e {
    /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasınızı giriniz: ");
        int age = scan.nextInt();
        System.out.println("lutfen kilonuzu giriniz: ");
        int kilo = scan.nextInt();
        if(age<18){
            System.out.println("kan bagısı yapamazsınız");
        } else if (age>18 && kilo<50) {
            System.out.println("kan bagısı yapamazsınız");
        } else if (age>18 && kilo>50) {
            System.out.println("kan bagısı yapabilirsiniz");
        }
    }
}
