package day18multidimensionalarray;

public class Md04Tekrar {
    //Ornek: Bir integer multi dimensional arraydeki en kucuk ve en buyuk elemanlarin toplamini bulunuz
    public static void main(String[] args) {
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 ==>47

        int max = ages[0][0];
        int min = ages[0][0];

        for(int w[]:ages){
           for(int k: w){
               min = Math.min(min,k);
               max = Math.max(max,k);
           }
        }
        System.out.println(max + min);
    }




}
