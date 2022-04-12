package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        /*nums -> [4, 3, 2, 44, 1, 100, 55]
          nums -> [55, 100, 1, 44, 2, 3, 4]
          i = length -1   i+1 = length-2
          */

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int temp = nums[0];
        for (int i = 0; i < nums.length/2; i++) {
            temp = nums[i];
            nums [i]= nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }


        System.out.println(Arrays.toString(nums));





    }
}
