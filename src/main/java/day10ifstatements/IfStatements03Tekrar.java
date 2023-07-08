package day10ifstatements;

import java.util.Scanner;

public class IfStatements03Tekrar {

    //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
    //January ==> 1...

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ay ismi giriniz: ");
        String month = input.next();

        if(month.equalsIgnoreCase("january")){
            System.out.println("birinci ay");
        }else if(month.equalsIgnoreCase("february")){
            System.out.println("ikinci ay");
        }else if(month.equalsIgnoreCase("march")){
            System.out.println("ucuncu ay");
        }else if(month.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(month.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(month.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(month.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(month.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(month.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(month.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(month.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(month.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid month name...");
        }

    }
}
