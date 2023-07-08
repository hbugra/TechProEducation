package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru6 {

    /* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz array index giriniz..");
        int numOfElements = input.nextInt();

        double degerArray[] = new double[numOfElements];
        double newdegerArray[] = new double[numOfElements];

        for (int i = 0; i < degerArray.length; i++) {
            System.out.println("array degeri giriniz: ");
            double deger = input.nextInt();
            degerArray[i] = deger;
        }
        System.out.println(Arrays.toString(degerArray));

        int a = 0;

        for (int i = 0; i < degerArray.length; i++) {
            newdegerArray[a] = Math.pow(degerArray[i],2);
            a++;

        }
        System.out.println(Arrays.toString(newdegerArray));

    }
}
