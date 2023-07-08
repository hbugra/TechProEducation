package day21arraylists;

import java.util.ArrayList;

public class ArrayLists01Tekrar {

    public static void main(String[] args) {
        //ArrayList nasil olusturulur?
        ArrayList<Integer> bugra = new ArrayList<>();
        //ArrayList console a nasil yazdirilir?
        System.out.println(bugra);
        //Arraylistlere eleman nasil eklenir?
        bugra.add(5);
        bugra.add(6);
        bugra.add(7);
        bugra.add(1, 177);
        bugra.add(2, 128);
        System.out.println(bugra);
        //List e coklu eleman nasil eklenir? veya List e baska bir list nasil eklenir?
        ArrayList<Integer> mehmet = new ArrayList<>();
        mehmet.add(23);
        mehmet.add(99);
        mehmet.add(2, 535);
        bugra.addAll(mehmet);
        System.out.println(bugra);
        //ArrayList'te eleman sayisi nasil bulunur?
        int numElements = bugra.size();
        System.out.println(numElements);
        //ArrayListte specific bir eleman nasil alinir?
        int get = bugra.get(1);
        System.out.println(get);
        int get2 = bugra.get(0);
        //ArrayList te specific bir eleman nasil degisitirilir?
        int set = bugra.set(2, 127);
        System.out.println(bugra);
        //Bir List teki tum elemanlari nasil silebilirim?
        //bugra.clear();
        //System.out.println(bugra);
        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        Boolean r = bugra.contains(5);
        System.out.println(r);
        //Bir ArrayList'in bos olup olmadigini nasil kontrol edebiliriz.
        Boolean isEmpty = bugra.isEmpty();
        System.out.println(isEmpty);
        //Ornek: Size verilen bir list in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList <String> veli = new ArrayList<>();
        veli.add("bugra");
        veli.add("cengiz");
        veli.add("veli");
        Boolean isEmptyy = veli.isEmpty();
        System.out.println(isEmptyy);


    }


}
