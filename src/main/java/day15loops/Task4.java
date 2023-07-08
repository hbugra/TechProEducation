package day15loops;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz: ");
        String a = input.nextLine();

        //Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.

        /*char first =a.charAt(0);
        System.out.println(first);//A
        char last =a.split(" ")[1].charAt(0);
        System.out.println(last);
        System.out.println(""+first+last);//AC*/

        /*int startingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail*/


        int boslukSayisi = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                boslukSayisi++;
            }
        }

        for (int b = 0; b <= boslukSayisi; b++) {

            String kelime = String.valueOf(a.split(" ")[b].length());
            String uzunKelime = "";
            if(kelime.length()>uzunKelime.length()){
                uzunKelime=kelime;
            }
            System.out.println(uzunKelime);
        }





    }


}



