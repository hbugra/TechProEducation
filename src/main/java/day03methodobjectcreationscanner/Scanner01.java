package day03methodobjectcreationscanner;
//Javanın util kütüphanesinden scanner class import edildi.
import java.util.Scanner;

public class Scanner01 {

    /*
    * Scanner ; kullanıcıdan data alip kullanmamızı saglar
    */

    public static void main(String[] args) {
    /*
    * 1. Adim Scanner Class tan object olustur
    */
        Scanner input = new Scanner(System.in);
        //System.out.println(); system.out sistem den out, system.in system e gir
    /*
    * 2. Adim kullanıcıya ne istediginize dair mesaj veriniz.
    */
        System.out.println("lütfen yasinizi giriniz: ");
    /*
    * 3. Adim Uygun methodu kullanarak kullanicinin verdigi datay, memory'e yerlestir.
    */
        int age= input.nextByte();
        System.out.println("age = " + age);

    }


}
