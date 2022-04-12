package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //TODO: WRITE YOUR CODE HERE

        int [] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            if(i==list.length-1){
                list[i]= nums[0];
            }
            else {
                list [i]= nums[i+1];
            }
        }

        System.out.println(Arrays.toString(list));
    }
}
