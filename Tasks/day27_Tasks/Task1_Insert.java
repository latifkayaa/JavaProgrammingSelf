package day27_Tasks;

import java.util.Arrays;

public class Task1_Insert {
    public static void main(String[] args) {

       int [] arr = {10, 20, 30, 40, 50};
       int [] newArr= insert(arr,2,100);
        System.out.println(Arrays.toString(newArr));

    }

    public static int [] insert(int [] nums, int index, int element){
        int[] result = new int[nums.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = nums[i];
        }

        return result;
    }

    public static double [] insert(double [] nums, int index, double element){
        double[] result = new double[nums.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = nums[i];
        }

        return result;
    }
    public static char [] insert(char [] nums, int index, char element){
        char[] result = new char[nums.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = nums[i];
        }

        return result;
    }

    public static String [] insert(String [] nums, int index, String element){
        String[] result = new String[nums.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < nums.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = nums[i];
        }

        return result;
    }
    
    


}


/*1.1 Create a method named insert that passes three
        parameters: integer array, integer index, integer element. the method
        inserts the given element to the given index of the array and returns the
        new array
        Ex:
        arr = {10, 20, 30, 40, 50};
        insert(arr, 2, 100) ==> {10,
        20, 100, 30, 40, 50}
        1.2 Create the same function for double array, char array
        and string array
        */

