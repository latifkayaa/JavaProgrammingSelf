package day24_Tasks;

import java.util.Arrays;

public class Task6_AddingElement {
    public static void main(String[] args) {
/* 6. create a method named addElement that takes one integer array and one integer,
the method can add the Integer number after the  last index of the integer array and returns the new array*/

        int [] arr ={1,2,3};
        int num = 4;
        int [] newArr2 = addingElement(arr,num);
        System.out.println(Arrays.toString(newArr2));



    }
    public static int [] addingElement(int [] nums, int element){

        int [] newArr =  Arrays.copyOf(nums, nums.length+1);
        newArr [newArr.length-1] = element;

        return newArr;


    }
}
