package day24_Method_Return;


import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,9132};

        int [] reversed = Arrays.copyOf(numbers,numbers.length);

        reversed = numbers(reversed);

        System.out.println(Arrays.toString(reversed));



    }

    public static int [] numbers(int [] nums){

        for (int i = nums.length-1, j=0; i>=0; i--, j++) {
            nums[j]= nums[i];
        }
        return nums;
    }
}
