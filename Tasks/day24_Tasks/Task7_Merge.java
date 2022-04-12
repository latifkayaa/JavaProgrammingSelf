package day24_Tasks;

import java.util.Arrays;

public class Task7_Merge {
    public static void main(String[] args) {
/*7. Create a method named merge that passes two integer array parameters,
the method can merge two integer arrays and return the new array
Ex:arr1 = {1,2,3} arr2 = {4,5,6}
merge(arr1, arr2) ====> {1,2,3,4,5,6} */
        int [] arr1 = {1,2,3,4,-10,0};
        int [] arr2 = {4,5,6};
        int [] newArr = merge(arr1,arr2);
        System.out.println(Arrays.toString(newArr));

    }
    public static int [] merge (int [] nums1,int [] nums2 ){
        int [] merged = new int[nums1.length+ nums2.length];
        int i=0;
        for (int num : nums1) {
            merged [i] = num;
            i++;
        }

        for (int num2 : nums2) {
            merged [i] = num2;
            i++;
        }
        return merged;
    }
}
