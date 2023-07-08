package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03Tekrar {

    public static void main(String[] args) {
        //Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, yellow dan onceki elemanlari yaziriniz

        String a[] = new String[6];
        a[0] = "ali";
        a[1] = "blue";
        a[2] = "green";
        a[3] = "black";
        a[4] = "yellow";
        a[5] = "black";

        for(String w:a){
            if(w.equals("yellow")){
                break;
            }
            System.out.println(w);;
        }

        //Ornek 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length-1]);

        int min = ages[0];
        int max = ages[0];
        for(int w: ages){
            min = Math.min(min,w);
            max = Math.max(max,w);
        }
        System.out.println(min+max);
    }
}
