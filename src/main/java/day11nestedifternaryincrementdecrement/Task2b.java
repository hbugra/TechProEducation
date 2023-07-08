package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Task2b {

    public static void main(String[] args) {
        /*  TASK :
     *  Kullanicidan 3 tene pozitif  tam sayi alniz.
     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO :
         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
         a+b>c>a-b
         a+c>b>a-c
         b+c>a>b-c
        a=b=c ise es kenar ucgen
        */

        Scanner input = new Scanner(System.in);
        System.out.println("birinci kenar uzunlugunu giriniz: ");
        int a = input.nextInt();
        System.out.println("ikinci kenar uzunlugunu giriniz: ");
        int b = input.nextInt();
        System.out.println("ucuncu kenar uzunlugunu giriniz: ");
        int c = input.nextInt();
        boolean ucgenmi = (a + b > c && c > Math.abs(a - b)) || (a + c > b && b > Math.abs(a - c)) || (b + c > a && a > Math.abs(b - c));


        if (ucgenmi) {
            System.out.println("ucgendir");
            if (a == b && b == c) {
                System.out.println("ucgendir ve es kenardir");
            }
        } else {
            System.out.println("ucgen degildir");
        }


    }
}
