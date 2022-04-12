package day15_ForLoops;

public class ForLoopPractice {
    public static void main(String[] args) {


        for (int i = 1; i <= 50; i++)  {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 50; 45 <= i ; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 55 ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }



    }
}
