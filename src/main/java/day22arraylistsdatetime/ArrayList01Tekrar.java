package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01Tekrar {

    public static void main(String[] args) {
        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (double w : prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.println(w);
            }
        }
        //Ornek 2: Bir listte tekrarli eleman olup olmadigini bulan kodu yaziniz
        List<Double> prices2 = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
        for (double w : prices2) {
            if (prices.indexOf(w) != prices.lastIndexOf(w)) {
                System.out.println(w);
            }

            if(w>0){
                System.out.println("tekrarlı eleman var");
            }
        }


    }
}
