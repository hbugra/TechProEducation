package day07stringmanipulations;


import java.util.Scanner;

public class StringManipulations02Tekrar {

    /*
         Ornek:
             Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                 1) En az 8 charcter olsun
                 2) Space characteri passwordde olmasin
                 3) En az bir buyuk harf olsun
                 4) En az bir kucuk harf olsun
                 5) En az bir rakam olsun
    */

    public static void main(String[] args) {

        // 1) En az 8 character olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen passwordunuzu giriniz: ");
        String pwd = scan.nextLine();
        boolean a = pwd.length() > 7;
        System.out.println("pwd en az 8 karakterli mi ? " + a);
        // 2) Space characteri passwordde olmasin
        boolean b = !pwd.contains(" ");
        System.out.println("space karakteri iceriyor mu ? " + b);
        //3) En az bir buyuk harf olsun
        boolean c = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("en az bir büyük harf iceriyor mu ?" + c);
        //4) En az bir kucuk harf olsun
        boolean d = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("en az bir kucuk harf var mı ?" + d);
        //  5) En az bir rakam olsun
        boolean e = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("en az bir rakam var mı? " + e);

    }
}
