package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        //==================================
        // initialization
        int z = 0;
        for (; z <= 1000; ) {
            if (z % 10 == 0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }


        for (int j = 0; j <= 1000; j++) {
            if (j % 10 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}

