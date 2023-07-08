package day06swapvaluesstringmanipulations;

public class SwapValuesTekrar {
    public static void main(String[] args) {

        int a = 12;
        int b = 25;
        int temp = 0;

        /*temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);*/

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a + " b: " + b);


    }
}
