package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int [] list1= {1,2,3};
        int [] list2= {4,5,6};
        System.out.println(Arrays.toString(merge(list1,list2)));

    }

    public static int[] merge (int[] nums1, int[] nums2){

        int length = nums1.length+nums2.length;
        int [] result = new int[length];

        int i=0;
        for (int num1 : nums1) {
            result[i] = num1;
            i++;
        }
        for (int num2 : nums2) {
            result[i]= num2;
            i++;
        }

        return result;

    }

    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }

        return result;
    }


    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            result[i++] = each;
        }

        for (char each : arr2) {
            result[i++] = each;
        }

        return result;
    }


    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }

        return result;
    }
}
