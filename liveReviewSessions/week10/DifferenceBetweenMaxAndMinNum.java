package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceBetweenMaxAndMinNum {
    public static void main(String[] args) {
        int [] numList= {1,2,3,4,5,6,7,8,9,10,11,12};
        int diff= difference(numList);
        System.out.println("Difference = " + diff);

        int count= CountOfEvenNums.countEven(numList);
        System.out.println("count = " + count);


    }
    public static int difference(int [] nums){
       /* int min = nums[0];
        int max = nums[0];
*/
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        for (int num : nums) {
            if(max<num){
                max = num;
            }
            if(min>num){
                min = num;
            }
        }
        return (max-min);

    }
}
