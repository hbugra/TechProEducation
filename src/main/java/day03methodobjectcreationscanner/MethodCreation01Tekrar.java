package day03methodobjectcreationscanner;

public class MethodCreation01Tekrar {

    //Ornek 1: Verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.
    public static int kup(int a){
        return a*a*a;
    }
    //Ornek 1: İkinci yol
    public static void kup2(int a){ //herhangi bir sey döndürmediğinden void yazdık
        System.out.println(a*a*a);
    }

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
     public static void print(String str){
         System.out.println(str);
     }

    //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
    private static void carpma(int c,int d) {
        System.out.println(c*d);
    }

    //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
    private static void kareAlma(int sayi) {
        System.out.println(sayi*sayi);
    }

    public static void main(String[] args) {
    //Ornek 1:
        int sonuc = kup(3);
        System.out.println("sonuc = " + sonuc);

        int a =3;
        kup2(a);

    //Ornek 2:
        print("Java is easy");
    //Ornek 2: 2.yol
        String str = "Techpro Edu";
        print(str);

    //Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        carpma(3,4);

    //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.

        /*
         ******kısayol******
         *variable ı başta yazarız
         *method ismi ve parametreleri yazariz
         *kirmizi kismin uzerinde bekleyip create method a tiklariz intellij otomatik olarak bir method olusturur
         *daha sonra kendi istegimize gore dizayn ederiz.
         */

    int sayi = 4;
    kareAlma(sayi);

    }

}
