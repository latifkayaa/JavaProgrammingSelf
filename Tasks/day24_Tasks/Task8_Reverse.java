package day24_Tasks;

import java.util.Arrays;

public class Task8_Reverse {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int [] reverse (int [] nums){

        int [] reversed = new int[nums.length];

        for (int i = nums.length-1, j=0; i >=0 ; i--, j++) {
            reversed[j] =nums[i];
        }
        return reversed;

    }
}

/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

 */