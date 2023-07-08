package day10ifstatements;

import java.util.Scanner;

public class IfStatementsHomework {

    /*
    Homework
    1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
    uygun mesaj veren kodu yaziniz

    2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
    Pazar ==> 1. gun , Pazartes ==> 2. gun...

    3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
    1==>January , 2==> February
 */

    public static void main(String[] args) {
        /*Homework
        1)Kullanicidan alinan password "pwd123!" oldugunda verilen password un dogru olup olmadigini kontrol eden ve kullaniciya
        uygun mesaj veren kodu yaziniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen password giriniz: ");
        String pwd = input.nextLine();

        if(pwd.equals("pwd123!")){
            System.out.println("password dogru");
        }else {
            System.out.println("password hatalidir.");
        }
        /*2)Haftanin gun ismini verdiginizde kacinci gun oldugunu veren kodu yaziniz
        Pazar ==> 1. gun , Pazartes ==> 2. gun...*/
        Scanner input2 = new Scanner(System.in);
        System.out.println("lütfen gun ismi giriniz: ");
        String day = input2.next();
        if(day.equalsIgnoreCase("pazartesi")){
            System.out.println("1.gun");
        }else if(day.equalsIgnoreCase("sali")){
            System.out.println("2.gun");
        }else if(day.equalsIgnoreCase("carsamba")){
            System.out.println("3.gun");
        }else if(day.equalsIgnoreCase("persembe")){
            System.out.println("4.gun");
        }else if(day.equalsIgnoreCase("cuma")){
            System.out.println("5.gun");
        }else if(day.equalsIgnoreCase("cumartesi")){
            System.out.println("6.gun");
        }else if(day.equalsIgnoreCase("pazar")){
            System.out.println("7.gun");
        }else{
            System.out.println("lutfen gun adi giriniz: ");
        }
       /* 3)Ay sayisini verdiginizde ay ismini veren kodu yaziniz
        1==>January , 2==> February*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay sayisini giriniz : ");
        int month = scan.nextInt();
        if(month==1){
            System.out.println("January");
        }else if(month==2){
            System.out.println("February");
        }else if(month==3){
            System.out.println("March");
        }else if(month==4){
            System.out.println("April");
        }else if(month==5){
            System.out.println("May");
        }else if(month==6){
            System.out.println("June");
        }else if(month==7){
            System.out.println("July");
        }else if(month==8){
            System.out.println("August");
        }else if(month==9){
            System.out.println("September");
        }else if(month==10){
            System.out.println("October");
        }else if(month==11){
            System.out.println("November");
        }else if(month==12){
            System.out.println("December");
        }else{
            System.out.println("lutfen ay sayisini 1-12 arasinda giriniz (1 ve 12 dahil)");
        }









    }


}
