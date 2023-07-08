package day08interviewquestions;

import java.util.Scanner;

public class InterviewQuestionsQ03 {
   /*
    *  Q03 TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup
    *  olmadığını kontrol ediniz.
   */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen string giriniz: ");
        String input = scan.nextLine();
        boolean isContains = input.contains(" ");
        System.out.println("isContains space = " + isContains);

    }

}
