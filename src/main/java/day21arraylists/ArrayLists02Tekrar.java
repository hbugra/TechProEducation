package day21arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists02Tekrar {
    //Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
    //Iki listin esit olabilmesi icin ayni index te ayni elemanlar olmalidir
    public static void main(String[] args) {
        ArrayList<Integer> bugra = new ArrayList<>();
        bugra.add(5);
        bugra.add(2);
        ArrayList<Integer> mehmet = new ArrayList<>();
        mehmet.add(5);
        mehmet.add(2);
        Boolean same = bugra.equals(mehmet);
        System.out.println(same);
        //Ornek: Size verilen iki Integer list te tamamiyla ayni elemanlarin olup olmadigni kontrol eden kodu yaziniz
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        Boolean isSame = nums1.equals(nums2);
        System.out.println(isSame);
        //ArrayList te bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]
        //remove() methodu bir elemanin ilk gorunumunu siler
        //remove() methodu index ile kullanilirsa size silmis oldugu datayi return eder
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden boolean return eder
        System.out.println(cities.remove(2));
        System.out.println(cities.remove("Miami"));
        //Ornek: Bir integer List olusturun ve 12 elemanini  Listden siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        System.out.println(ages);
        ages.remove(ages.indexOf(12));
        System.out.println(ages);







    }


}
