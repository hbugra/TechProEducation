package day15loops;

import java.util.Scanner;

public class NestedLoopTekrar {
    /*                Example 1: Asagidaki sekli cizen kodu yaziniz
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir deger giriniz: ");
        int a = input.nextInt();


        for(int i = 1; i<=a; i++){

            for(int k = 1; k<=i;k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

      /*  for (int i = 1; i <= row;              i++) {

            for (int k = 1; k <=i ;          k++) {
                System.out.print(k+" ");
            }
            System.out.println();//tek gorevi inner loop tamamlandiktan sonra pointeri bir sonraki satira almak
        }*/




    }




}
