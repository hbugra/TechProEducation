package day18multidimensionalarray;

public class Md01Tekrar {

    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Ornek 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz.
       int sum  = 0;

       for(String[] w : students){
           sum = sum + w.length;
       }






    }


}



