package day13loops;

import java.util.Scanner;

public class Task {
    /* TASK :
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*******Musteri Portalina Hos Geldiniz !*******");
        System.out.println("lutfen aldiginiz urunun adedini belirtiniz: ");
        int qty = input.nextInt();
        System.out.println("lutfen aldıginiz urunun liste fiyatini giriniz: ");
        double price = input.nextDouble();
        System.out.println("Musteri kartiniz var midir ?\n" +
                            "Eger varsa \"Evet\"\n" +
                            "Yoksa \"Hayir\" yaziniz ..");

        String varYok = input.next();
        method( qty,price, varYok);

    }

    private static void method(int qty, double price, String varYok) {
        if(varYok.equalsIgnoreCase("evet")){
            if(qty>10){
                System.out.println("Urun icin odemeniz gereken bedel: " + price*qty*0.8);
            }else{
                System.out.println("Urun icin odemeniz gereken bedel: " + price*qty*0.85);
            }
        } else if (varYok.equalsIgnoreCase("hayir")) {
            if(qty>10){
                System.out.println("Urun icin odemeniz gereken bedel: " + price*qty*0.85);
            }else{
                System.out.println("Urun icin odemeniz gereken bedel: " + price*qty*0.90);
            }
        }
    }



}
