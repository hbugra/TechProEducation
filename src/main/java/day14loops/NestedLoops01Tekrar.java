package day14loops;

public class NestedLoops01Tekrar {
    /*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz

    Week: 1
    Day: 1
    Day: 2
    Day: 3
            .....
    Week: 2
    Day: 1
    Day: 2
    Day: 3
            ....       */

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("week: " + i);
            for (int y = 1; y <= 30; y++) {
                System.out.println(" day: " +y);
            }
        }


    }


}
