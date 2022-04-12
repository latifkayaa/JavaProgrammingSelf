package day24_Method_Return;

public class ReturnMax {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,-10,100};

        int maxNum = maxNum(nums);
        System.out.println("maxNum = " + maxNum);
        int minNum=minNum(nums);
        System.out.println("minNum = " + minNum);


    }
    public static int maxNum(int [] number){
        int max=number[0];

        for (int i : number) {
            if(i>max){
                max =i;
            }
        }
        return max;
    }
    public static int minNum (int [] number){
        int min=number[0];

        for (int i : number) {
            if(i<min){
                min =i;
            }
        }
        return min;
    }
}
