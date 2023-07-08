package day10ifstatements;

import java.util.Scanner;

public class NestedIf03Tekrar {

    public static void main(String[] args) {
        /*
                    Password'un ilk harfi buyuk harf ise
                        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        Adana ==> Gecerli
                    Passwordun ilk harfi kucuk harf ise
                        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        zehirli ==> Gecerli         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen password giriniz: ");
        String pwd = scan.nextLine();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("gecerli passowrd");
            } else {
                System.out.println("gecersiz password");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("gecerli passowrd");
            } else {
                System.out.println("gecersiz password");
            }
        } else {
            System.out.println("Ilk character harf olmali");
        }


    }
}
