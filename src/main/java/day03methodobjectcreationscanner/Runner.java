package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {

        /*
        * Object nasil olusturulur ?
        * Class ismi + Object ismi + Assigment Operatoru + "new" keywordu + Constructer
        * new keywordu sıfırdan yeni bir obje olusturmak icin kullanılır
        * Constructer Javada obje olusturmak icin kullanılan özel bir method dur. Class ismi ile aynı olur.
        * objeyi oluşturduktan sonra aktif ve pasif özelliklere ulaşabiliriz. Bunun icin myCar "." dediğimizde tüm variabler var
        * ve methodlara ulaşabiliriz.
        *
        */

        Car myCar = new Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat); // Not burada kısayol icin myCar.fiyat.soutv dersek otomatik olarak sysout komutu yazılır.
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();//zaten method da syso print komutu oldugundan tekrar kullanmaya gerek yok.
        myCar.dur();

        Student aliCan = new Student();
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        System.out.println("aliCan.name = " + aliCan.name);
        aliCan.feed();
        aliCan.study();

        /*
        * icinde isim ve yas variable ları olan teach metodu bulunan bir teacher
        * ogretmen objesi olusturun ve obje üzerinde bu özellikleri kullanın.
        */

        School myTeacher =  new School();
        System.out.println("myTeacher.age = " + myTeacher.age);
        System.out.println("myTeacher.name = " + myTeacher.name);
        myTeacher.teach();

    }

}
