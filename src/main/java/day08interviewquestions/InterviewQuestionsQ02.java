package day08interviewquestions;

import java.util.Scanner;

public class InterviewQuestionsQ02 {
   /*
    * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
    * return eden metod yaziniz
    *
    * ornek:  input            output
    *         elma  2           eaea
    *         army  3           ayayay
    */
    public static void returnYazdir(String first,int c) {

        char a = first.charAt(0);
        char b = first.charAt(first.length()-1);
        String concat = String.valueOf(a) + String.valueOf(b);
        System.out.println(concat.repeat(c));

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen string giriniz : ");
        String first = scan.next();
        System.out.println("how many times");
        int c = scan.nextInt();
        returnYazdir(first,c);

    }

}
