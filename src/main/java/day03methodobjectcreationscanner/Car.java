package day03methodobjectcreationscanner;

public class Car {
    /*
    *1.Obje üretebilmek için bir class olusturulur en basta - kalıp yani sınıfa ihtiyacımız var
    *2.Daha sonra objenin variable ları olusturulur.
    *3.Method olusturulur
    *Not: çünkü method lar ve variable lar class içinde olur.
    *
    *
    */

    //Variable'lar olusturalım - pasif özellikleri

    public String model = "Tesla";  //burada variable olustururken access modifer kullandık, normalde Javada
    public int fiyat =20000;        //access modifier kullanılmadıgında default olarak kendisi kullanır.


    //Methodları olusturalim - aktif özellikleri
    //Note: "return type" void oldugunda method icinde "return" keywordu kullanilmaz

    public void hareket(){
        System.out.println("Tesla cok hizli hareket eder...");
    }
    public void dur(){
        System.out.println("Cok güvenli bir sekilde durur...");
    }

}
