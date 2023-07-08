package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01Tekrar {

    public static void main(String[] args) {
        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yil, ay ve gun giriniz: ");
        int year = scan.nextInt();
        int ay = scan.nextInt();
        int gun = scan.nextInt();

        LocalDate a = LocalDate.of(year, ay, gun);
        if (a.isBefore(LocalDate.now())) {
            System.out.println("Gecersiz tarih girdiniz");
        } else {
            System.out.println("Enter time for ticket");
        }
       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println(givenDate + " invalid date");
        } else {
            System.out.println("Enter time for ticket");
        }*/
        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        LocalDate b = LocalDate.of(1982,7,6);
        System.out.println(b.getDayOfWeek());

    }
}
