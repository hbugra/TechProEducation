package day20Sunum;

import java.util.Arrays;
import java.util.Scanner;

public class Soru3 {
    // Task-> verilen bir int arrayin elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz
    //chatgpt den baktım
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

        for (int i = 0; i < degerArray.length-1; i++) { // her array sayisini digerleriyle kıyaslamak icin ic ice dongu yapmalısınız
            for(int k = 0; k<degerArray.length-i-1; k++){
                if(degerArray[k]<degerArray[k+1]){
                    int temp = degerArray[k];
                    degerArray[k] = degerArray[k + 1];
                    degerArray[k + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(degerArray));


    }
}
