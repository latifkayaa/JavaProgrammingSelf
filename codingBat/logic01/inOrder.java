package logic01;

public class inOrder {
    public static void main(String[] args) {

    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk) {
            if ( c > b) {
                return true;
            } else {
                return false;
            }

        } else {
            if (a < b && b < c) {
                return true;
            } else {
                return false;
            }
        }
    }

}
