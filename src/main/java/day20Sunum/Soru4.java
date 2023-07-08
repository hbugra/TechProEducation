package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {
//Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz array index sayısını giriniz..");
        int numOfElements = input.nextInt();
        int degerArray[] = new int[numOfElements];

        for (int i = 0; i < degerArray.length; i++) {
            System.out.println("array degeri giriniz: ");
            int deger = input.nextInt();
            degerArray[i] = deger;

        }
        System.out.println(Arrays.toString(degerArray));
        System.out.println();

        for (int i = 0; i < degerArray.length; i++) {
            if(degerArray[i]%2!=0){
                System.out.print(degerArray[i] + " ");
           }
        }
    }
}
