package day17arrays;

import java.util.Arrays;

public class Arrays03Tekrar2 {

    public static void main(String[] args) {
        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }

        }
        if (counter >= 1) {
            System.out.println("vardir");
        } else {
            System.out.println("yoktur");
        }

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, el);
        System.out.println(result);
    }


}
