package day13loops;

public class Loops02Tekrar {

    public static void main(String[] args) {
        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for(int i=21; i<181; i++){
            if(i%2==0 && i%3==0){
                System.out.println("i = " + i);
            }
        }
        //Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        String a = "ankara";
        for(int i = 0; i<a.length()-1; i++){
            if(i%2==0){
                System.out.println(a.toUpperCase().charAt(i));
            }
        }
        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"
        String b = "I love Java";
        for(int i = 0; i<b.length(); i++){
            if(b.charAt(i)=='a'){
                break;
            }
            System.out.print(b.charAt(i));
        }

    }
}
