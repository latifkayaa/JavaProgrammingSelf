package day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you wanna input?");
        int length = scan.nextInt();
        int[] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list[i] = scan.nextInt();
        }
        

        int[] moved = new int[length];
        int j=0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0 ) {
                moved[j++] = list[i];
            }

        }
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(moved));
        
    }
}
