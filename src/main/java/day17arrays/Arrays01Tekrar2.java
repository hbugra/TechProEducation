package day17arrays;

public class Arrays01Tekrar2 {

    public static void main(String[] args) {
        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int a[] = {1, 2, 3, 4, 5, 6};
        int cift = 0;

        for (int w : a) {
            if (w % 2 == 0) {
                cift++;
            }

        }
        System.out.println(cift);
        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz
        String c[] = {"ali", "bugra", "cengiz", "ahmet", "heybetullah"};
        for (String w : c) {
            if (w.length() <= 5) {
                System.out.println(w);
            }
        }
        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz
        String d[] = {"ali", "bugra", "cengiz", "fahmet", "heybetullah"};
        for (String w : d) {
            if(!w.startsWith("f")){
                System.out.println(w);
            }
        }


    }
}
