package day08stringmanipulationmemoryusageifstatement;

import java.util.Scanner;

public class Homework {
    /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz
     */
    public static void main(String[] args) {

        String a = "Java is easy to learn";

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        int b = a.replaceAll("[0-9]","").length();
        System.out.println("Rakam olmayan tum karakterlerin sayısı = " + b);

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console'a buyuk harflerle yazdiriniz
        String c = "Java is easy to learn";
        String d = c.substring(1,c.length()-1).toUpperCase(); // 1.index ten son karakter harici aralık
        System.out.println("d = " + d);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        String f = "Java is easy to learn";
        char firstChar = f.charAt(0);
        char lastChar  = f.charAt(f.length()-1);
        System.out.println(firstChar+lastChar);

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //console a yazdirin
        String g = "anKaRa";
        String first = g.substring(0,1).toUpperCase();
        String others = g.substring(1).toLowerCase();
        System.out.println("changed: " + first + others);

        /*
        5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir password giriniz: !");
        String pwd = scan.next();

        //a)En az 6 character olsun
        boolean atLeastSixCharacter = pwd.length()>6;
        System.out.println("atLeastSixCharacter = " + atLeastSixCharacter);

        //b)En az bir tane buyuk harf olsun
        boolean atleastOneCapital = pwd.replaceAll("[^A-Z]","").length()>=1;
        System.out.println("atleastOneCapital = " + atleastOneCapital);

        //c)En az bir tane kucuk harf olsun
        boolean atleastOneLowerCase = pwd.replaceAll("[^a-z]","").length()>=1;
        System.out.println("atleastOneLowerCase = " + atleastOneLowerCase);

        //d)En az bir tane rakam olsun
        boolean atleastOneNumber = pwd.replaceAll("[^0-9]","").length()>=1;
        System.out.println("atleastOneNumber = " + atleastOneNumber);

    }
}