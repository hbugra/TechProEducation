package day10ifstatements;

import java.util.Scanner;

public class IfStatements02Tekrar {

    //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
    //  1==> Pazar, 2 ==> Pazartesi .....

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen gün sayisini giriniz: ");
        int day = input.nextInt();

        if(day==1){
            System.out.println("monday");
        } else if (day==2) {
            System.out.println("tuesday");
        } else if(day==3){
            System.out.println("wednesday");
        } else if(day==4){
            System.out.println("thursday");
        } else if(day==5){
            System.out.println("friday");
        } else if(day==6){
            System.out.println("saturday");
        } else{
            System.out.println("lütfen gün sayisini veriniz");
        }


    }


}
