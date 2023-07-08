package day15loops;

import java.util.Scanner;

public class asdasd {

    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {

       /*
       Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
        */

        for(int i=1; i<=1;i++){
            for(int s=1;s<=8; s++){
                System.out.print("A");
            }
            System.out.println();
        }
        for(int l=1;l<=3;l++){
            for(int k=1;k<=1; k++){
                System.out.print("A");
            }
            for(int j=2;j<=7; j++){
                System.out.print("X");
            }
            for(int m=8;m<=8; m++){
                System.out.print("A");
            }System.out.println();
        }

        System.out.println();
    }
}
