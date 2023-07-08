package day13loops;

public class Loops03Tekrar {

    public static void main(String[] args) {
        //Ornek: Verilen bir String de kucuk harfleri console a yazmayiniz

        String a ="AnKaRa";
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
                System.out.println(a.charAt(i));
            }
        }

        String b ="AnKaRa";
        for(int i = 0; i<b.length(); i++){
            if(b.charAt(i)>='a' && b.charAt(i)<='z'){
                continue;
            } else{
                System.out.print(b.charAt(i));
            }

        }


    }

}
