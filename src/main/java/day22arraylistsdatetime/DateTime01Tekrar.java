package day22arraylistsdatetime;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01Tekrar {

    public static void main(String[] args) {
        //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //Tarih ten istedigimiz bileseni nasil aliriz?
        int a = date.getDayOfMonth();
        System.out.println(a);
        //Month bir enum dir
        //Enum java da sabit degerler (Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri) depolamak icin kullanilir
        Month b = date.getMonth();
        System.out.println(b);
        //DayOfWeek bir enumdir
        DayOfWeek c = date.getDayOfWeek();
        System.out.println(c);
        //ileriki tarihe nasil gidilir?
        LocalDate d = date.plusDays(2);
        System.out.println(d);
        //Specific bir tarih object i nasil olusturulur?
        LocalDate e = LocalDate.of(1998,12,21);
        System.out.println(e);
        LocalDate date2 = LocalDate.of(1980, 8, 10);
        //Bir tarihin bir tarih ten sonra olup olmadigi nasil kontorl edilir?
        Boolean e1 = e.isBefore(date2);
        System.out.println(e1);





    }
}
