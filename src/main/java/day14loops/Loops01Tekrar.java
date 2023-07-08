package day14loops;

import java.util.Scanner;

public class Loops01Tekrar {

    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen string giriniz: ");
        String a = input.next();
        //1.yol
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        //2.yol
        String ters = "";
        for (int y = a.length() - 1; y >= 0; y--) {
            ters = ters + a.substring(y, y + 1);
        }
            System.out.println(ters);
        //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404
        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz: ");
        String c = scan.nextLine();
        String ters1 ="";
        for(int z = c.length()-1; z>=0; z--){
            ters1 = ters1 + c.substring(z, z+1);
        }
        if(c.equalsIgnoreCase(ters1)){
            System.out.println("Palindrom dur");
        }else{
            System.out.println("Palindrom değildir");
        }











    }

}


