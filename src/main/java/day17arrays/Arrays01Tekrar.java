package day17arrays;

import java.util.Arrays;

public class Arrays01Tekrar {


    public static void main(String[] args) {
        //Arrayleri kisa yoldan nasil olusturabiliriz?
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(a));

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.
        int cift = 0;

        for (int w : a) {
            if (w % 2 == 0) {
                cift ++;
            }
        }
        System.out.println("Cift sayi = " + cift);
        System.out.println("Tek sayi = " + (a.length - cift));


        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String c[] = {"ali","bugra","cengiz","ahmet","heybetullah"};

        for(String w:c){
            if(w.length()<=5){
                System.out.println(w);
            }
        }
        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz
        String d[] = {"ali","bugra","cengiz","fahmet","heybetullah"};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for(String w:d){
            /*if(!(w.startsWith("f"))){
                System.out.println(w);
            }*/
            if(w.startsWith("f")){
                continue;
            }
            System.out.println(w);
        }






    }
}
