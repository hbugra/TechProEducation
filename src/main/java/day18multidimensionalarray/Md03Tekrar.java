package day18multidimensionalarray;

public class Md03Tekrar {

    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e cevriniz.
        int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}

        int toplam = 0;
        for (int w[] : numbers) {
            toplam = toplam + w.length;
        }
        System.out.println(toplam);
        int newArr[] = new int[toplam];
        int idx = 0;

        for (int w[] : numbers) {
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
    }
}
