package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru7 {

        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
         */



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz array index giriniz..");
        int numOfElements = input.nextInt();

        int degerArray[] = new int[numOfElements];
        int newdegerArray[] = new int[numOfElements];

        for (int i = 0; i < degerArray.length; i++) {
            System.out.println("array degeri giriniz: ");
            int deger = input.nextInt();
            degerArray[i] = deger;
        }
        System.out.println(Arrays.toString(degerArray));
        System.out.println();


        int count = 0;
        for (int i = 0; i < degerArray.length; i++) {
            if(degerArray[i]%3==0){
                count++;
            }
        }
        System.out.println("Üç'e bolunebilen sayi adedi: " + count);
    }
}
