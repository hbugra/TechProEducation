package day08interviewquestions;

import java.util.Scanner;

public class InterviewQuestionsQ05 {
   /*
    *   Q05 TASK :
    *   Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
    *   Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
   */

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        System.out.println("lütfen 3 kelimeden oluşan ad ve soyadınızı giriniz: ");
        String f = e.nextLine();
        char a = f.charAt(0);
        String acronymFirst = String.valueOf(a).toUpperCase();
        char b = f.split(" ")[1].charAt(0);
        String acronymSecond = String.valueOf(b).toUpperCase();
        char c = f.split(" ")[2].charAt(0);
        String acronymThirt = String.valueOf(c).toUpperCase();
        System.out.println("acronym =" + acronymFirst+ "." + acronymSecond+"." + acronymThirt + ".");

    }
}
