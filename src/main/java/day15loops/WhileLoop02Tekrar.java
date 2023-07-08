package day15loops;

import java.util.Scanner;

public class WhileLoop02Tekrar {


    //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz


    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayiyi giriniz: ");
        int a = scan.nextInt();
        int carpim ;
        int i=1;
        while(i<10){
            carpim = a*i;
            System.out.println("carpim= " + a + "*" + i + "=" + carpim+ " ");
            i++;

        }*/

//Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz
        /*Scanner input = new Scanner(System.in);
        System.out.println("lutfen sayiyi giriniz: ");
        String b = input.next();
        int c = 0;
        while(c<b.length()){

            //newWord = newWord + word.charAt(a) + "*";
            System.out.print(b.charAt(c) + "*");
            c++;
        }
*/
//Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz: ");
        String a = input.next();
        int i = 0;
        String sonuc ="";

        while (i<a.length()) {
            char ch = a.charAt(i);
            if(a.indexOf(ch)==a.lastIndexOf(ch)){
                sonuc = sonuc + ch;
            }
            i++;
        } System.out.println(sonuc);

    }
}
