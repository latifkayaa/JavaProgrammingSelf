package day24_Tasks;

import java.util.Arrays;

public class Task10_RemoveElement {
    public static void main(String[] args) {
        int [] arr1 = {10, 20, 30, 40, 50, 60};
        int [] removedArr = removedElement(arr1,2);
        System.out.println(Arrays.toString(removedArr));

    }

    public static int [] removedElement (int [] nums, int index){
        int [] newArr = new int[nums.length-1];


        for (int i= 0, j = 0; i < nums.length; i++) {
            if(i == index){
                continue;
            }
            newArr[j++] = nums[i];
        }

        return newArr;
    }


}
/*10. create a method named removeElement that passes one integer array and one integer,
 the method removes the integer index from the integer array and returns the new array
Ex:array = {10, 20, 30, 40, 50, 60}
index = 2
removeElement(array, index) ==== {10, 20, 40, 50, 60}


*/