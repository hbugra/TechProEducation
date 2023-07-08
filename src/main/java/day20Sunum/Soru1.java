package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
        input:  [1,2, 3]
        output [2, 3, 1]
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz array index giriniz..");
        int numOfElements = input.nextInt();

        int degerArray[] = new int[numOfElements];
        int newdegerArray[] = new int[numOfElements];

        for (int i = 0; i < degerArray.length; i++) {
            System.out.println("array degeri giriniz: ");
            int deger = input.nextInt();
            degerArray[i] = deger;


        }System.out.println(Arrays.toString(degerArray));
        for (int i = 0; i < degerArray.length-1; i++) {
            newdegerArray[i] = degerArray[i + 1];

        }
        int i = 0;
        newdegerArray[newdegerArray.length-1] = degerArray[i];
        System.out.println(Arrays.toString(newdegerArray));


    }
}




