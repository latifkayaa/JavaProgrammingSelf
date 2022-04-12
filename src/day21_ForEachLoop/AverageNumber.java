package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many elements you want in the array?");
        int length = scan.nextInt();
        
        double [] nums = new double[length];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number:");
            nums[i]= scan.nextInt();
        }

        double sum=0;

        for (double num : nums) {
            sum += num;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(sum/length);
    }
}
