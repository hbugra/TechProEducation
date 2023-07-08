package day13loops;

public class Loops01Tekrar {

    public static void main(String[] args) {

        for(int i=0; i<=5; i++){
            System.out.println("Hi");
        }

        for(int i = 11; i<16; i++ ){
            System.out.println(i);
        }

        //Ornek 3: 40 dan 23 e kadar tum cift sayilari ekrana yazdiriniz.

        for(int i = 40; i>22; i--){
            if(i%2==0){
                System.out.println(i);
            }
        //Ornek 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.

        for(int a=18; a<57; a++){
            if(a%2==1){
                System.out.println("a = " + a);
            }
        }

        }


    }

}
