package day15loops;

import java.util.Scanner;

public class DoWhile02Tekrar {

    /*
        Kullanicidan bir tamsayi aliniz
        Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
        Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
     */

    public static void main(String[] args) {



        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen bir tam sayi giriniz: ");
            int num = scan.nextInt();

            if(num<=100){
                System.out.println("kaybettiniz!");
            }else{
                System.out.println("kazandiniz");
                break;
            }

        }while(true);




    }
}
