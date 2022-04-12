package logic02;

import java.util.Arrays;

public class evenlySpaced {
    public static void main(String[] args) {

    }

    public boolean evenlySpaced(int a, int b, int c) {

        int [] nums = {a,b,c};
        Arrays.sort(nums);

        if(nums[1]- nums[0] == nums[2] - nums[1]){
            return true;
        }
        else{
            return false;
        }




    }
}
