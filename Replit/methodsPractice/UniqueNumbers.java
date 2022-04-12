package methodsPractice;

import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int i = 0; i < nums.length; i++) {
            int count=0;
            int number = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int number2=nums[j];
                if(number==number2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(number);
            }

        }

    }

}
