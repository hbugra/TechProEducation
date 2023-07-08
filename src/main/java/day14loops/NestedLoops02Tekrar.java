package day14loops;

import java.util.Scanner;

public class NestedLoops02Tekrar {

    public static void main(String[] args) {

        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X        */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sutun sayisini giriniz: ");
        int sutun = input.nextInt();
        System.out.println("lutfen satir sayisini giriniz: ");
        int satir = input.nextInt();


        for(int i = 1; i<=sutun; i++){
            for(int y =1; y<=satir; y++){
                System.out.print("*");
            }
            System.out.println();
        }




    }


}
