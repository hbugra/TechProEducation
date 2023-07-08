package day07stringmanipulations;

public class StringManipulations01Tekrar {

    public static void main(String[] args) {
        String t = "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        String a = t.replaceAll("[0-9]","*");
        System.out.println("a = " + a);

        //Ornek 2: "t" stringindeki tum rakamlari ve harfleri "!" e ceviriniz
        String b = t.replaceAll("[0-9A-Za-z]","!");
        System.out.println("b = " + b);

        //Ornek 3: "t" stringindeki tum sesli harfleri "?" e ceviriniz
        String c = t.replaceAll("[aeiouAEIOU]","?");
        System.out.println("c = " + c);


        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String d = t.replaceAll("[^a-z]","<>");
        System.out.println("d = " + d);

        //Ornek 5: "t" stringindeki tum harfler disindaki tum characterleri "+" ceviriniz
        String e = t.replaceAll("[^a-zA-Z]","+");
        System.out.println("e = " + e);

        //Ornek 6: "t" stringindeki space ler disindaki tum characterleri "?" e ceviriniz
        String f = t.replaceAll("[^ ]","?");
        System.out.println("f = " + f);

        //Ornek 7:  "t" stringindeki sesli harfler disindaki tum characterleri "&" e ceviriniz
        String g = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("g = " + g);
    }

}
