package day03methodobjectcreationscanner;

public class MethodDeclarationHomework {

    public static void main(String[] args) {
    /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alinini hesaplayan methodu olusturunuz ve kullaniniz
     */

    int a =3;
    int b =4;
    cemberCevre(3,4);

    float pi = 3.14F;
    double r = 2.6;
    daireAlan(3.14F,2.6);

    }

    private static void daireAlan(float pi, double r) {
        System.out.println("Daire Alan: " + pi*r*r);
    }

    private static void cemberCevre(int a,int b) {
        System.out.println("Cember Cevre: " + 2*(a+b));
    }

}
