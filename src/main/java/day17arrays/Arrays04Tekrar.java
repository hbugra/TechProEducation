package day17arrays;

import java.util.Arrays;

public class Arrays04Tekrar {

    public static void main(String[] args) {
        //Ornek 1: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        //Ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String all[] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(all));
        System.out.println(all.length);


    }
}
