package day22arraylistsdatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03Tekrar {

    public static void main(String[] args) {
         /*
   Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin

   String class kullanmak tercih edilir cunku string class method acisindan cok zengindir
    */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");


        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen string giriniz: ");
            String a = scan.next();
            if(myList.contains(a)){
                myList.set(myList.indexOf(a), "buldum!");
            }
            else{
                myList.add(a);
                System.out.println(myList);
            }
        }while(true);





    }
}
