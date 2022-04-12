package day24_Tasks;

public class Task5_FrequencyInteger {
    public static void main(String[] args) {
/*  5. create method that accepts one integer array and one integer number and returns the frequency of the number
 */
        int[] array ={1,1,1,1,1,2,2};
        int frequency = frequencyInteger(array,1);
        System.out.println("frequency = " + frequency);


    }

    public static int frequencyInteger (int [] nums, int check){
        int count=0;
        for (int num : nums) {
            if (num==check){
                count++;
            }
        }
        return count;

    }
}

