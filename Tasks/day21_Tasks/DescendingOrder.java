package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        //Write a program that sort the array of integer in descending order

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want to input:");
        int length = scan.nextInt();

        int [] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        int [] reversed = new int[length];

        for (int i = 0, j = length-1; i < reversed.length; i++, j--) {
            reversed[i] = list[j];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
