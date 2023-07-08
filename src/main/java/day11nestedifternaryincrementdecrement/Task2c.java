package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Task2c {
    /* TASK :
            *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
           INFO :
           BMI = kilo(kg) /(boy*boy)(m)
           BMI <=20 oldukca zayifsiniz
           20<BMI<=25 Normal sinirlardasiniz
           25<BMI<=30 Sisman kategorisindesiniz
           30<BMI ==> Obez grubundasiniz.

            */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen boyunuzu metre birimi olarak giriniz: ");
        double boy = input.nextDouble();
        System.out.println("lutfen kilonuzu kg olarak giriniz: ");
        double kilo = input.nextDouble();
        double bmi = kilo /(boy*boy);
        System.out.println("vucut kutle endeksiniz: " + bmi);
        if(bmi<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (bmi>20 && bmi<25) {
            System.out.println("oldukca zayifsiniz");
        } else if (bmi>=25 && bmi<=30) {
            System.out.println("normal sinirlardasiniz");
        } else {
            System.out.println("Obez grubundasiniz.");
        }
    }
}
