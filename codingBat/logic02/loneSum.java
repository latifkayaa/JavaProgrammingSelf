package logic02;

public class loneSum {
    public static void main(String[] args) {

    }

    public static int loneSum(int a, int b, int c) {

        if (a == b && b == c) {
            return 0;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        } else if (a == b) {
            return c;
        } else {
            return a + b + c;
        }
    }
}