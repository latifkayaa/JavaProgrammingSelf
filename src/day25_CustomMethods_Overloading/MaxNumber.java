package day25_CustomMethods_Overloading;

public class MaxNumber {
    public static void main(String[] args) {


    }

    public static int maxNumber (int [] nums){
        int max = nums[0];
        for (int num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static double maxNumber (double [] nums){
        double max = nums[0];
        for (double num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static long maxNumber (long [] nums){
        long max = nums[0];
        for (long num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static short maxNumber (short [] nums){
        short max = nums[0];
        for (short num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static float maxNumber (float [] nums){
        float max = nums[0];
        for (float num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
    public static byte maxNumber (byte [] nums){
        byte max = nums[0];
        for (byte num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }

}
