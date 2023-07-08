package day06swapvaluesstringmanipulations;

public class StringManipulations02Tekrar {
    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" (Regex) kullanir.
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Note:Regex ifadesinde "^" isareti haric anlamina gelir
        //Ornek 7:"t" String indeki tum rakamlari (0,1,2,3,4,5,6,7,8,9) "*" a ceviriniz

       /* Meshur Regex ler
        1) Tum rakamlar               ==> [0-9]
        2) Tum kucuk harfler          ==> [a-z]
        3) Tum buyuk harfler          ==> [A-Z]
        4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri   ==> \\p{Punct}
        7) Tum sesli Harfler          ==> [aeiouAEIOU]
        8) Tum x,q,w harfleri         ==> [xqw]

        Olumsuzlari
        9) Kucuk harflerden farkli tum characterler => [^a-z]
        10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]*/


        String s1 = t.replaceAll("[0-9]", "x" );
        System.out.println("s1 = " + s1);
        //Ornek 8:"t" String indeki tum harf ve rakamlari (0,1,2,3,4,5,6,7,8,9) "1" a ceviriniz
        String s2 = t.replaceAll("[0-9A-Za-z]", "1");
        System.out.println("s2 = " + s2);

    }
}
