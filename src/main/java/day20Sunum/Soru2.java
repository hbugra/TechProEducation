package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;
//// Task-> girilen int değeri tersten print eden code create ediniz. ?????
// Task2-> girilen int array değeri tersten print eden code create ediniz.
public class Soru2 {

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
        Arrays.sort(degerArray);
        int a = 0;
        for (int i = degerArray.length - 1; i >= 0; i--) {
            newdegerArray[a] = degerArray[i];
            a++;
        }
        System.out.println(Arrays.toString(newdegerArray));
    }
}
