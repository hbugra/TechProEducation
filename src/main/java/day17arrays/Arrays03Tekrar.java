package day17arrays;

import java.util.Arrays;

public class Arrays03Tekrar {


    //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.


    public static void main(String[] args) {
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "R";

        int counter = 0;
        for (String w : names) {
            if (w.equalsIgnoreCase(el)) {
                counter++;
                break;
            }
        }

        if (counter > 0) {
            System.out.println("vardir");
        } else {
            System.out.println("yoktir");
        }

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);
        System.out.println(Arrays.toString(names));
        System.out.println(result);
    }
}
