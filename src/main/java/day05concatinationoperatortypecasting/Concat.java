package day05concatinationoperatortypecasting;

public class Concat {
    public static void main(String[] args) {
        /*Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz*/
        String tv = "$1100";
        String radio="$300";
        System.out.println(tv+radio);//$1100$300

        int totalPrice =  Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);
    }
}
