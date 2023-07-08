package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {

    // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

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

        int a = 0;
        int b = 0;
        for (int i = degerArray.length-1; i >= 0; i--) {
            newdegerArray[a] = degerArray[degerArray.length - 1-b];
            a++;
            b++;
        }
        System.out.println(Arrays.toString(newdegerArray));
    }
}

