package Arrays;

import java.util.Scanner;

public class FindNonDuplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        int uniq = 0;

        for (int num : nums) {
            count = 0;

            for (int num2 : nums) {
                if (num == num2) {
                    count++;
                }

            }
            if (count == 1) {
                uniq = num;
            }


        }
        System.out.println(uniq);


    }
}
