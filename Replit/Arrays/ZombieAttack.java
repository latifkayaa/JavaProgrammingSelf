package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        // copy of the first array, to store inhabitans when its population divided into 2 in each iteration:
        int[] last = Arrays.copyOf(inhabitants, inhabitants.length);

        System.out.println("Day 0 " + Arrays.toString(last));

        for (int i = 0; i < inhabitants.length; i++) {

            int j = 0;

            for (int inhabitant : last) {

                if (last[j] > 1) {
                    last[j] = inhabitant / 2;
                } else {
                    last[j] = 0;
                }
                j++;
            }

            //if the new array/last's all elements' sum equals to 0, I wanna break the loop. Below code:
            int sum = 0;

            for (int element : last) {
                sum += element;
            }

            System.out.println("Day " + (i + 1) + " " + Arrays.toString(last));

            if (sum == 0) {
                break;
            }
        }

        System.out.println("---- EXTINCT ----");
    }
}
