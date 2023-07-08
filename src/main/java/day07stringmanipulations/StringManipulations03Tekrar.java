package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations03Tekrar {

    public static void main(String[] args) {

        //Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        //  "    Ali Can    " ==> "Ali Can"

        /*Scanner scan = new Scanner(System.in);
        System.out.println("lütfen string karakter giriniz: ");
        String c = scan.nextLine();
        String d = c.trim();
        System.out.println(d);*/

        //Ornek 2: Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        //  String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";
        String tv2 = tv.replace("$","");
        System.out.println(tv2);

        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);

        double totalPrice =Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Ornek 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        // "   Ali Can    " ==> AC
        String name = "   ali cAN    ";
        //split() methodu bir string i istedigimiz karakterden parcalamaya yarar

        char first =name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A
        char last =name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);
        System.out.println(""+first+last);//AC

    }


}
