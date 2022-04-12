package day21_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class MergeThreeArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want to input:");
        int length = scan.nextInt();

        int [] list = new int[length];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a number:");
            list[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list));

        System.out.println("Enter for second array how many elements you want to input:");
        int length2 = scan.nextInt();

        int [] list2 = new int[length2];

        for (int i = 0; i < list2.length; i++) {
            System.out.println("Enter a number:");
            list2[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list2));

        System.out.println("Enter how many elements you want to input:");
        int length3 = scan.nextInt();

        int [] list3 = new int[length3];

        for (int i = 0; i < list3.length; i++) {
            System.out.println("Enter a number:");
            list3[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(list3));

        int [] merged = new int[length+length2+length3];

        int j = 0;
        for (int num : list) {
            merged[j] = num;
            j++;
        }

        for (int num : list2) {
            merged[j] = num;
            j++;
        }

        for (int num : list3) {
            merged[j] = num;
            j++;
        }

        System.out.println(Arrays.toString(merged));

    }
}
