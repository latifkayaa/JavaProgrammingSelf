package day24_Tasks;

public class Task9_isContain {
    public static void main(String[] args) {
        int[] arr = {1, -10, 2, 3, 4, 5, 6, 7};
        boolean check = isContain(arr, -10);
        System.out.println("check = " + check);
    }

    public static boolean isContain(int[] nums, int number) {
        for (int num : nums) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }
}

/*9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false */