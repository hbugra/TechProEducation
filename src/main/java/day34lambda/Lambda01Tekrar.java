package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01Tekrar {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);

        nums.stream().forEach(t -> System.out.println(t + " "));

        //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
        // koyarak yazdiran method'u olusturunuz.(Functional)

        nums.stream().filter(t -> t % 2 != 0).forEach(t -> System.out.println(t + " "));

        //Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
        //aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.println(t + " "));

        //Örnek 4 Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

        nums.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.println(t + " "));
        /*Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
        hesaplayan method oluşturun*/
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t)
                .reduce(0, (t, u) -> (t + u));
        /*8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
        // "çarpımını" hesaplayan bir method oluşturun*/
        Integer a = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).
                reduce(1,(t,u)->(t*u));
        /*9) Verilen List'teki "minimum değeri" bulmak için bir method oluşturun*/
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder())
                .reduce((t,u)->(u)).get();
        /*10)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
        // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi*/
        Integer min1 = nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();


    }


}
