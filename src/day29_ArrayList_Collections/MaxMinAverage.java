package day29_ArrayList_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinAverage {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,6,6,7,7,7));
        int max = nums.get(0);
        int min = nums.get(0);
        int sum=0;


        for (Integer num : nums) {
            if(max<num){
                max=num;
            }
            if(min>num){
                min = num;
            }
            sum+=num;
        }
        System.out.println("Average = " + (sum/nums.size()));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
