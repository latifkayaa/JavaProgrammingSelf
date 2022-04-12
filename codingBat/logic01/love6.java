package logic01;

public class love6 {
    public static void main(String[] args) {
/*The number 6 is a truly great number.
Given two int values, a and b, return true if either one is 6.
Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
 */

        System.out.println(love6(7,13));
    }



    public static boolean love6(int a, int b) {
        int diff = a-b;

        if(a==6 || b==6 || (a+b==6) || Math.abs(diff)==6){
            return true;
        }else{
            return false;
        }


    }


}
