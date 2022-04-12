package logic01;

public class specialEleven {
    public static void main(String[] args) {
/*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
 */

        System.out.println(specialEleven(12));
    }

    public static boolean specialEleven(int n) {

        if (n % 11 == 0 || (n % 11 == 1)) {
            return true;
        } else {
            return false;
        }
    }

}
