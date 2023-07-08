package day17arrays;

import java.util.Arrays;

public class Arrays05Tekrar02 {

    //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
    public static void main(String[] args) {
        int a[] = {0, 2, 3, 0, 12, 0};
        int c[] = new int[6];
        Arrays.sort(a);
        int d = 0;
        System.out.println(Arrays.toString(a));
        for(int w:a){
            if(w!=0){
                c[d] = w;
                d++;
            }
        }System.out.println(Arrays.toString(c));



    }


}
