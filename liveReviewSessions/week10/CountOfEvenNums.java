package week10;

public class CountOfEvenNums {
    public static void main(String[] args) {

        int [] numList = {1,2,3,4,5,6,7,8,9,10};
        int countEven= countEven(numList);
        System.out.println("countEven = " + countEven);
    }

    public static int countEven (int [] nums){

        int count=0;
        for (int num : nums) {
            if(num%2==0){
                count++;
            }
        }
        return count;
    }
}
