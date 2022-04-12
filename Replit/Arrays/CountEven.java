package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count =0;
        for (int num : nums) {
            if (num%2==0){
                count++;
            }
        }
        System.out.println(count);


        int []nums2={1,2,35,20,30,21};
        int []temp=nums2;
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(nums2));


    }
}
