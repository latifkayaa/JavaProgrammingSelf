package day18_NestedLoop;

public class NestedLoopAsterisk2 {
    public static void main(String[] args) {
        /*
        * 8 times
        * *


         */

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
