package day14loops;

import java.util.Scanner;

public class Loops02Tekrar {

    public static void main(String[] args) {
        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //   5+6+7+8 ==> 26

        int sum=0;
        for(int i=5; i<=8; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        //Ornek 2 : 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9 => 504

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ilk sayiyi giriniz: ");
        int a = input.nextInt();
        System.out.println("lutfen ikinci sayiyi giriniz: ");
        int b = input.nextInt();

        int sum1 = 1;

        for(int i=a; i<=b; i++){
            sum1 = sum1 * i;
        }
        System.out.println(sum1);

    }


}
