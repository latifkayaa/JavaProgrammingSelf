package day20Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many number you wanna input?");
        int length = scan.nextInt();

        int[] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list[i]= scan.nextInt();
        }

        int [] reversed = new int[length];

        for (int i = length-1, j=0; i >=0 ; i--, j++) {
            reversed[j] =list[i];
        }

        System.out.println(Arrays.toString(reversed));



    }
}
