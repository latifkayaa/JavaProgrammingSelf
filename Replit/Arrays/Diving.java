package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        //28 * 2.1
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
        }

        System.out.println("Enter difficulty:");
        float diff = input.nextFloat();
        System.out.println(diff);

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        float total = 0.0f;
        for (int i = 0; i < score.length; i++) {
            if (i > 0 && i < 6) {
                total += score[i];
            }

        }
        System.out.println(total);
        total = total * diff;
        total *=0.6f;

        System.out.printf("Total: %.2f", total);


    }
}
