package day21arraylists;

import java.util.List;

public class ArrayLists03Tekrar {

    public static void main(String[] args) {
        //Kisa yoldan bir list nasil olusturulur?
        List<Character> bugra = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(bugra);
        //bugra.set(0,'c'); // Degisiklik yapmaya yonelik methodlari desteklemez
        //System.out.println(bugra);
    }
}
