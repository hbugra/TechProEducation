package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Task2d {
        /*  TASK :
         *  Kullanicidan IT alanini bilgisini alarak console'a
         *  meslegi = qa ==> Quality Analyst
                     dev ==> Developer
                      ba ==> Busines Analyst
                      pm ==> Project Manager
        bilgilileri yazdiriniz
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen IT alani bilginizi giriniz: ");
        String alan = scan.next();

        if(alan.equalsIgnoreCase("qa") ){
            System.out.println("Quality Analyst");
        } else if (alan.equalsIgnoreCase("dev")) {
            System.out.println("Developer");
        } else if (alan.equalsIgnoreCase("ba")) {
            System.out.println("Busines Analyst");
        } else if (alan.equalsIgnoreCase("pm")) {
            System.out.println("Project Manager");
        } else {
            System.out.println("lutfen gecerli bir alan adi giriniz!");
        }
    }
}
