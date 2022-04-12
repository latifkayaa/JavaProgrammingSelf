package logic01;

public class sortaSum {
    public static void main(String[] args) {
/*Given 2 ints, a and b, return their sum.
However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 */
        System.out.println(sortaSum(10,9));
    }

    public static int sortaSum(int a, int b) {

        if((a+b)>=10 && (a+b)<=19){
            return 20;
        }
        else{
            return a+b;
        }
    }

}
