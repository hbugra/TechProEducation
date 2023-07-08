package day02datatypesmethodcreation;

public class MethodCreation01Tekrar {

    /* Ornek 1: toplama islemi yapan bir method olusturunuz */
    public static int toplama(int a, int b){
        return a + b;
    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturunuz
    public static int multiply(int a, int b){
        return a*b;
    }
    /*Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan
    methodu olusturunuz ve kullaniniz*/
    protected static int complex(int a, int b, int c){
        return a*b+c;
    }
    /*
        1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullaniniz
        2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz.
    */

    public static double alanDikdörtgen(float a, double b){
        return a*b;
    }
    protected static double cevreDikdörtgen(float a, double b){
        return 2*(a+b);
    }



    public static void main(String[] args) {

    int sonuc = toplama(3,5);
        System.out.println(sonuc);

    int result =  multiply(2,3);
        System.out.println(result);

    int result2 = complex(1,2,3);
        System.out.println(result2);

    double sonucAlan = alanDikdörtgen(2.1F, 3.5);
        System.out.println(sonucAlan);

    double sonucCevre = cevreDikdörtgen(2.1F, 3.5);
        System.out.println(sonucCevre);
    }




}
