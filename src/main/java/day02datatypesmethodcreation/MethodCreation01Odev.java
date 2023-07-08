package day02datatypesmethodcreation;

public class MethodCreation01Odev {

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
        double sonucAlan = alanDikdörtgen(2.1F, 3.5);
        System.out.println("Dikdörtgenin alani: " + sonucAlan);

        double sonucCevre = cevreDikdörtgen(2.1F, 3.5);
        System.out.println("Dikdörtgenin cevresi: " + sonucCevre);
    }


}
