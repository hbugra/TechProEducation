package day08interviewquestions;

import java.util.Scanner;

public class InterviewQuestionsQ04 {
   /*
    *   Q04 TASK :
    *   tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    *   ad ayrı soyad ayrı sekilde ekrana yazdırınız.
   */

    public static void main(String[] args) {
        //1.yol
        Scanner a = new Scanner(System.in);
        System.out.println("lütfen ad ve soyadınızı giriniz: ");
        String b = a.nextLine();
        String[] parts = b.split(" ");
        String ad = parts[0];
        String soyad = parts[1];
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        //2.yol
        Scanner c = new Scanner(System.in);
        System.out.println("lütfen ad ve soyadınızı giriniz: ");
        String d = a.nextLine();
        String name = d.substring(0, d.indexOf(" "));
        System.out.println("name = " + name);
        String surname = d.substring(d.indexOf(" ")+1);
        System.out.println("surname = " + surname);
    }
}
