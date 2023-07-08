package day15loops;

import java.io.PrintStream;

public class WhileLoop01Tekrar {

    //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz


    public static void main(String[] args) {

        int k= 23;

        while(k>11){

            if(k%2==0){
                System.out.println(k);

            }
            k--;
        }

//Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.


        int a = 6;
        while (a<19){

            if(a%2==1){
                System.out.println(a);
            }
            a++;
        }



    }


}
