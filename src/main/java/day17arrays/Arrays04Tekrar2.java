package day17arrays;

import java.util.Arrays;

public class Arrays04Tekrar2 {

    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";
        String a[] = s.split(" ");
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String b[] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);
    }
}
