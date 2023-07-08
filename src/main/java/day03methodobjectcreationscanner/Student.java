package day03methodobjectcreationscanner;

public class Student {

    //Variable -> pasif özellikler

    public String name = "Ali Can";
    public byte grade = 8;
    public String adress = "Ankara";

    //Method oluşturduk -> aktif özellikler

    public void study(){
        System.out.println("Gunluk tekrarlarını asla ihmal etmez");
    }
    public void feed(){
        System.out.println("Saglıklı beslenir.");
    }

}
