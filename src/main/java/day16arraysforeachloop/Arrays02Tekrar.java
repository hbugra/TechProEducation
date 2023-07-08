package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02Tekrar {

    public static void main(String[] args) {

        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin

        String a[] = new String[5];
        a[0] = "ali";
        a[1] = "ahmet";
        a[2] = "mehmet";
        a[3] = "veli";
        a[4] = "hasan";
        System.out.println(Arrays.toString(a));

        int top=0;
        for(String w:a){
            top = top+ w.length();
        }
        System.out.println(top);




    }

}
